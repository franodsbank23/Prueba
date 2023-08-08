package com.example.prueba.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.prueba.domain.model.BeerItemModel
import com.example.prueba.domain.model.BeerModel
import com.example.prueba.domain.usecases.getBeerListUsecase
import com.example.prueba.domain.usecases.getBeerUsecase
import kotlinx.coroutines.launch

class BeerListViewModel (
    private val getBeerListUsecase: getBeerListUsecase
    ): ViewModel() {

    private  val _beerList= MutableLiveData<List<BeerItemModel>>()
    val beerList : LiveData<List<BeerItemModel>> get() = _beerList

    private fun getData() {
        viewModelScope.launch {
                    getBeerListUsecase.invoke()
                }
            }


}