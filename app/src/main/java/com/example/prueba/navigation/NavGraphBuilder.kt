package com.example.prueba.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.prueba.presentation.detail.BeerDetailView
import com.example.prueba.presentation.list.BeerListView
import com.example.prueba.ui.components.InfoComponentView

//acá gestionamos las acciones del composable

// se agrega el add porque si no te lo toma antes
// mejorar el add


// item, list
// y acá el invoke
// por eso dps navegas

// screen vs view

fun NavGraphBuilder.logicBeerListView(navController: NavController) {
    composable(Screen.BeerListView.route){
        BeerListView(
            onDetailClick = { id ->
                navController.navigate("${Screen.BeerDetailView.route}/$id")
            },
            onInfoClick = {
                navController.navigate(Screen.InfoComponentView.route)
            }
        )

    }
}

// ¿le tengo que pasar todos los parámetros del composable?

fun NavGraphBuilder.logicBeerDetailView(navController: NavController) {
    composable(
        route= Screen.BeerDetailView.route +"/{beerId}",
        arguments= Screen.BeerDetailView.arguments
    ){
        val id = it.arguments?.getString("beerId")?: ""
        BeerDetailView(id = id,
            onBackClick = {
                navController.navigate(Screen.BeerListView.route)
            }
        )

    }
}

// acá está vista con AVS
fun NavGraphBuilder.logicInfoComponentView(navController: NavController){
    composable(
        route = Screen.InfoComponentView.route,
        arguments = Screen.InfoComponentView.arguments
    ){
        InfoComponentView (
            onBackClick = {navController.navigate(Screen.BeerListView.route)}
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
