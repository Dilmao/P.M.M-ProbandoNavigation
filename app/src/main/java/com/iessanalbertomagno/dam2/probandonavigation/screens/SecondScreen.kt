package com.iessanalbertomagno.dam2.probandonavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.iessanalbertomagno.dam2.probandonavigation.navigation.AppScreens

@Composable
fun SecondScreen(navController: NavController, text: String?) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Estas en la segunda ventana $text")
        Button(onClick = { navController.navigate(route = AppScreens.ThirdScreen.route) }) {
            Text(text = "Ir a ventana 3")
        }
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Volver atras")
        }
    }
}