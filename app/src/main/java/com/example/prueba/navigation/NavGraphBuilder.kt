package com.example.prueba.navigation

//acá gestionamos las acciones del composable

class NavigationGraphBuilder {
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
