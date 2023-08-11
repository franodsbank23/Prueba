package com.example.prueba.data.repository

import com.example.prueba.data.mappers.toBeerDetailModel
import com.example.prueba.data.mappers.toBeerItemModel
import com.example.prueba.data.remote.RemoteDataSourceInterface
import com.example.prueba.domain.model.BeerDetailModel
import com.example.prueba.domain.model.BeerItemModel

class BeerRepositoryImpl(
    private val remoteDataSource: RemoteDataSourceInterface,
) : BeerRepositoryInterface {

    // el mappeo y explícitamente la función mapper. acá tenemos lista

    override suspend fun getBeerList(): List<BeerItemModel> =
        remoteDataSource.getBeerList().map{it.toBeerItemModel()}



    override suspend fun getBeerById(id: String): BeerDetailModel =
        remoteDataSource.getBeerById(id).toBeerDetailModel()


}


