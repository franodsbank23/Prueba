package com.example.prueba.domain.usecases

import com.example.prueba.data.repository.BeerRepositoryInterface

class GetBeerListUsecase
    (
    private val beerRepository: BeerRepositoryInterface
    )
    {
    suspend fun invoke () = beerRepository.getBeerList()

}