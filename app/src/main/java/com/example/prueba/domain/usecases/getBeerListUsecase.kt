package com.example.prueba.domain.usecases

import com.example.prueba.data.repository.BeerRepositoryInterface

class getBeerListUsecase
    (
    private val beerRepository: BeerRepositoryInterface
    )
    {
    suspend fun invoke () = beerRepository.getBeerList()

}