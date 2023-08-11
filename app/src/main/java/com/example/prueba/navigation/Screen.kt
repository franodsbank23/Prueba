package com.example.prueba.navigation

import androidx.navigation.NamedNavArgument
import androidx.navigation.NavType
import androidx.navigation.navArgument

sealed class Screen(
    val route: String,
    val arguments: List<NamedNavArgument>
    ) {

    object BeerStartView : Screen(
        route="BeerStart_Screen",
        arguments = emptyList()
    )
    object BeerListView : Screen(
        route="BeerList_Screen",
        arguments = emptyList()
        )
    object BeerDetailView : Screen(
        route="BeerDetail_Screen",
        arguments = listOf(
            navArgument("beerId") {
                type = NavType.StringType
                nullable = false
            }
    )
    )

    object InfoComponentView: Screen (
        route="InfoComponent_Screen",
        arguments = emptyList()
            )
}





/*
sealed class Screen(val route: String) {
    object BeerListView : Screen(route="BeerList_Screen")
    object BeerDetailView : Screen(route="BeerDetail_Screen")
}*/

// ¿y si le pongo screen a toodo?