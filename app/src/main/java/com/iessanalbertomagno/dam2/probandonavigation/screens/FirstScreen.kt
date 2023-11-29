package com.iessanalbertomagno.dam2.probandonavigation.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.iessanalbertomagno.dam2.probandonavigation.navigation.AppScreens

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FirstScreen(navController: NavController) {
    var texto by remember { mutableStateOf("") }
    Column(modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally)
    {
        Text(text = "Estas en la primera ventana")
        OutlinedTextField(value = texto, onValueChange = {texto = it}, label = { Text(text = "Introduce tu nombre")})
        Button(onClick = { navController.navigate(route = AppScreens.SecondScreen.route + "/" + texto.toString()) }) {
            Text(text = "Ir a ventana 2")
        }
    }
}