package com.example.prueba.data.repository

import com.example.prueba.domain.model.BeerDetailModel
import com.example.prueba.domain.model.BeerItemModel
import com.example.prueba.domain.model.BeerModel

interface BeerRepositoryInterface {

    suspend fun getBeerList(): List<BeerItemModel>

    suspend fun getBeerById(id: String): BeerDetailModel
}

