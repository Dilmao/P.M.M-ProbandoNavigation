package com.iessanalbertomagno.dam2.probandonavigation.navigation

sealed class AppScreens(val route: String) {
    object FirstScreen: AppScreens (route = "first_screen")
    object SecondScreen: AppScreens (route = "second_screen")
    object ThirdScreen: AppScreens (route = "third_screen")
}

