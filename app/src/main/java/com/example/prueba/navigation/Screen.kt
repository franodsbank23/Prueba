package com.example.prueba.navigation

sealed class SealedScreen(val route: String) {
    object BeerListView : SealedScreen(route="BeerList_Screen")
    object BeerDetailView : SealedScreen(route="BeerDetail_Screen")
}