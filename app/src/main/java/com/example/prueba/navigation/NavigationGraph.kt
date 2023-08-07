package com.example.prueba.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.prueba.presentation.detail.BeerDetailView
import com.example.prueba.presentation.list.BeerListView

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = SealedScreen.BeerListView.route,
    )

    {
        logicBeerListView(navController)
        logicBeerDetailView(navController)

    }
}

// conviene hacerlo por fuera del composable

/*@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = SealedScreen.BeerListView.route,
    ) {
        composable(route= SealedScreen.BeerListView.route){
            BeerListView(navController= navController)
        }
    }
}*/
