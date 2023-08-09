package com.example.prueba.presentation.detail

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.prueba.domain.model.BeerDetailModel
import com.example.prueba.domain.model.BeerModel
import com.example.prueba.domain.usecases.getBeerListUsecase
import com.example.prueba.domain.usecases.getBeerUsecase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BeerDetailViewModel (
    private val getBeerUsecase: getBeerUsecase
): ViewModel() {

    private  val _beer = MutableLiveData<BeerDetailModel>()
    val beer : LiveData<BeerDetailModel> get() = _beer


    fun getBeer(id: String)  {
        viewModelScope.launch{
            val result = withContext(Dispatchers.IO){
                getBeerUsecase.invoke(id)
            }
            _beer.postValue(result)
            }

    }








}