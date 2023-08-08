package com.example.prueba.di.koin

import com.example.prueba.domain.usecases.getBeerListUsecase
import com.example.prueba.domain.usecases.getBeerUsecase
import org.koin.dsl.module
import kotlin.coroutines.EmptyCoroutineContext.get

val DomainModule = module {

    // los casos de USO
    single { getBeerListUsecase(get()) }
    single { getBeerUsecase(get()) }
}