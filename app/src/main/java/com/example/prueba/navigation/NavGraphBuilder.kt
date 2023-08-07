package com.example.prueba.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.prueba.presentation.detail.BeerDetailView
import com.example.prueba.presentation.list.BeerListView

//acá gestionamos las acciones del composable

// se agrega el add porque si no te lo toma antes
// mejorar el add

fun NavGraphBuilder.logicBeerListView(navController: NavController) {
    composable(SealedScreen.BeerListView.route){
        BeerListView(
            onDetailClicked = {
                navController.navigate(SealedScreen.BeerDetailView.route)
            }
        )

    }
}


fun NavGraphBuilder.logicBeerDetailView(navController: NavController) {
    composable(SealedScreen.BeerDetailView.route){
        BeerDetailView(
            onBackClicked = {
                navController.navigate(SealedScreen.BeerListView.route)
            }
        )

    }
}

/*
fun NavGraphBuilder.addLoginScreen(navController: NavController) {
    composable(Screen.LoginScreen.route) {
        LoginScreen(
            onForgotClicked = {
                navController.navigate(Screen.ForgotPasswordScreen.route)
            },
            onLoginSuccess = {
                navController.navigate(Screen.HeroListScreen.route)
            }
        )
    }
}

fun NavGraphBuilder.addForgotPasswordScreen() {
    composable(Screen.ForgotPasswordScreen.route) {
        ForgotPasswordScreen()
    }
}

fun NavGraphBuilder.addHeroListScreen(navController: NavHostController) {
    composable(Screen.HeroListScreen.route) {
        HeroListScreen { heroId ->
            navController.navigate("${Screen.HeroDetailScreen.route}/$heroId")
        }
    }
}*/
