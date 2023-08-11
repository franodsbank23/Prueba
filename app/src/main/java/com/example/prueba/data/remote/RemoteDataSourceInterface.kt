package com.example.prueba.data.remote

import com.example.prueba.data.dto.BeerDto

interface RemoteDataSourceInterface {

    suspend fun getBeerList(): List<BeerDto>

    suspend fun getBeerById(id: String): BeerDto

}