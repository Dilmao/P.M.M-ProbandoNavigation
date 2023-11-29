package com.iessanalbertomagno.dam2.probandonavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.iessanalbertomagno.dam2.probandonavigation.navigation.AppNavigation
import com.iessanalbertomagno.dam2.probandonavigation.ui.theme.ProbandoNavigationTheme

/*
* 1º. Implementation: ...navigation-compose (Gradle)
* 2º. Paquete screens: Añadimos las "ventanas" (funcion composable)
* 3º. Paquete navigation:
*           -Clase sellada AppScreens (indica las rutas validas)
*           -App Navigation con navController (remember) ¿donde estoy? y navHost (el timon y las velas)
*/

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProbandoNavigationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavigation()
                }
            }
        }
    }
}