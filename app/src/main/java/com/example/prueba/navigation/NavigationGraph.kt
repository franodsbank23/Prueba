package com.example.prueba.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

@Composable
fun NavigationGraph() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.BeerListView.route,
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
