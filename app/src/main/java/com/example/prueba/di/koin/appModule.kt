package com.example.prueba.di.koin

import com.example.prueba.data.remote.BeerApi
import com.squareup.moshi.Moshi
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

//como le paso la URL pegada a la API?
val baseUrl = BeerApi.BASE_URL

val appModule = module {

    single<Retrofit>{
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

    }

    single<Moshi>{
        Moshi.Builder()
            .addLast(KotlinJsonAdapterFacotry())
            .build()
    }

    fun kindofprovideBeerApi(retrofit: Retrofit) =
        retrofit.create(BeerApi::class.java)


}