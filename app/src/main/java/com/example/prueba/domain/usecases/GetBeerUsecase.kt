package com.example.prueba.domain.usecases

import com.example.prueba.data.repository.BeerRepositoryInterface
import com.example.prueba.domain.model.BeerDetailModel

//acá tenemos la función invoke que llevamos a todos lados

class GetBeerUsecase (
    private val beerRepository: BeerRepositoryInterface
        )
{
    suspend fun invoke (id: String) : BeerDetailModel = beerRepository.getBeerById(id)
}