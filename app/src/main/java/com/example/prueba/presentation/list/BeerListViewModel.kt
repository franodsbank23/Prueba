package com.example.prueba.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.prueba.domain.model.BeerItemModel
import com.example.prueba.domain.usecases.GetBeerListUsecase
import kotlinx.coroutines.launch

class BeerListViewModel (
    private val getBeerListUsecase: GetBeerListUsecase
    ): ViewModel() {

    /* init {
        getData()
    }*/

    private  val _beerList = MutableLiveData<List<BeerItemModel>>()
    val beerList : LiveData<List<BeerItemModel>> get() = _beerList

    fun getData() {
        viewModelScope.launch {
            val result = getBeerListUsecase.invoke()
            _beerList.postValue(result)
                }
            }
}