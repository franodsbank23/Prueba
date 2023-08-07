package com.example.prueba.presentation.list

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.prueba.data.dto.BeerItemDto



@Composable
fun BeerListView () {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(15.dp)
    ){
        items(List<BeerItemDto>){ item ->
            BeerItem(beerItemAttributes = item){
            }
        }
    }
}