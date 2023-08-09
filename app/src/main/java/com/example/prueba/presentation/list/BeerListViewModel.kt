package com.example.prueba.presentation.list

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.prueba.domain.model.BeerItemModel
import com.example.prueba.domain.model.BeerModel
import com.example.prueba.domain.usecases.getBeerListUsecase
import com.example.prueba.domain.usecases.getBeerUsecase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BeerListViewModel (
    private val getBeerListUsecase: getBeerListUsecase
    ): ViewModel() {

    init {
        getData()
    }

    private  val _beerList= MutableLiveData<List<BeerItemModel>>()
    val beerList : LiveData<List<BeerItemModel>> get() = _beerList

    fun getData() {
        viewModelScope.launch {
            val result = withContext(Dispatchers.IO)
            {
                getBeerListUsecase.invoke()
            }
            _beerList.value= result

                }
            }


}