package com.example.prueba.di.daggerhilt

import com.example.prueba.data.remote.BeerApi
import dagger.Provides
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

// DI con Dagger Hilt


object appModule {

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