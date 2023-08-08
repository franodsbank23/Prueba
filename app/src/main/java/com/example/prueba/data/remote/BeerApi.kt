package com.example.prueba.data.remote

import com.example.prueba.data.dto.principal.BeerDto
import retrofit2.http.GET


// revisar suspend fun
// obligatorio hacerlo con pagination? (por diseño de API)

interface BeerApi {

    @GET("beers")
    suspend fun getBeerList(): List<BeerDto>

    @GET("beers/{id}")
    suspend fun getBeerById(id: String): BeerDto


    companion object{
        const val BASE_URL = "https://api.punkapi.com/v2/"
    }
}

/*
interface BeerApi {

    @GET("beers")
    suspend fun getBeers(
        @Query("page") page: Int,
        @Query("per_page") pageCount: Int
    ): List<BeerDto>

    companion object{
        const val BASE_URL = "https://api.punkapi.com/v2/"
    }
}*/
