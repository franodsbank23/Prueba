package com.example.prueba.di.koin

import com.example.prueba.domain.usecases.GetBeerListUsecase
import com.example.prueba.domain.usecases.GetBeerUsecase
import org.koin.dsl.module

val DomainModule = module {

    // los casos de USO
    single { GetBeerListUsecase(get()) }
    single { GetBeerUsecase(get()) }
}