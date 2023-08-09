package com.example.prueba.data.remote

import com.example.prueba.data.dto.BeerDto

class RemoteDataSourceImpl (
    private val beerApi: BeerApi
        ) : RemoteDataSourceInterface {
    override suspend fun getBeerList(): List<BeerDto> =
        beerApi.getBeerList()

    override suspend fun getBeerById(id: String): BeerDto =
        beerApi.getBeerById(id)[0]

    }

