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
fun ThirdScreen(navController: NavController) {
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Estas en la tercera ventana")
        Button(onClick = { navController.popBackStack() }) {
            Text(text = "Volver atras")
        }
    }
}