package com.example.prueba.presentation.list

import androidx.compose.runtime.Composable

@Composable
fun BeerListView (beerItems: BeerItem) {
    LazyColumn{
        items(beerItems){
            BeerItem()
        }
    }
}