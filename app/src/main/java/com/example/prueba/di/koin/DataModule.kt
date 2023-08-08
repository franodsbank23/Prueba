package com.example.prueba.di.koin

import com.example.prueba.data.remote.BeerApi
import com.example.prueba.data.remote.RemoteDataSourceImpl
import com.example.prueba.data.remote.RemoteDataSourceInterface
import com.example.prueba.data.repository.BeerRepositoryImpl
import com.example.prueba.data.repository.BeerRepositoryInterface

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.androidx.compose.BuildConfig
import org.koin.androidx.compose.get
import org.koin.core.scope.get
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

//como le paso la URL pegada a la API?

val baseUrl = BeerApi.BASE_URL


val DataModule = module {

    single {
        OkHttpClient.Builder()
            .addInterceptor(HttpLoggingInterceptor(HttpLoggingInterceptor.Logger.DEFAULT).apply {
                level = HttpLoggingInterceptor.Level.BODY
            }).build()
    }

    single<Retrofit> {
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

    }

    single<Moshi> {
        Moshi.Builder()
            .addLast(KotlinJsonAdapterFactory())
            .build()
    }

    fun kindofprovideBeerApi(retrofit: Retrofit) =
        retrofit.create(BeerApi::class.java)


    single<BeerApi> {
        kindofprovideBeerApi(get())
    }

    single<BeerRepositoryInterface> { BeerRepositoryImpl(get()) }

    single<RemoteDataSourceInterface> { RemoteDataSourceImpl(get()) }
}