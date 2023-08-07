package com.example.prueba.di

import com.example.prueba.data.remote.BeerApi
import dagger.Provides
import dagger.hilt.android.qualifiers.ApplicationContext
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import javax.inject.Singleton

// DI con Dagger Hilt


object AppModule {

    @Provides
    fun provideBaseUrl(): String {
        return BeerApi.BASE_URL
    }

    @Provides
    fun provideRetrofit(baseUrl: String): Retrofit {
        return Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()

    }

    @Provides
    fun provideBeerApi(retrofit: Retrofit): BeerApi{
        return retrofit.create(BeerApi::class.java)
    }
}