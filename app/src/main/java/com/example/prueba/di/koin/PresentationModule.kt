package com.example.prueba.di.koin


import com.example.prueba.presentation.detail.BeerDetailViewModel
import com.example.prueba.presentation.list.BeerListViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val PresentationModule = module {

    // los VM
    viewModel { BeerListViewModel(get()) }
    viewModel { BeerDetailViewModel(get()) }
}