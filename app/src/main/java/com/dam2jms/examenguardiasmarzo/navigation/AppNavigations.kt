package com.dam2jms.examenguardiasmarzo.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.dam2jms.examenguardiasmarzo.models.ViewModelFirstScreen
import com.dam2jms.examenguardiasmarzo.models.ViewModelGuardia
import com.dam2jms.examenguardiasmarzo.models.ViewModelSecondScreen
import com.dam2jms.examenguardiasmarzo.screens.FirstScreen
import com.dam2jms.examenguardiasmarzo.screens.GuardiasScreen
import com.dam2jms.examenguardiasmarzo.screens.NuevaGuardiaScreen
import com.dam2jms.examenguardiasmarzo.screens.SecondScreen

@Composable
fun appNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = AppScreens.FirstScreen.route) {
        composable(route = AppScreens.FirstScreen.route) { FirstScreen(navController, mvvm = ViewModelFirstScreen()) }
        composable(route = AppScreens.SecondScreen.route) { SecondScreen(navController, mvvm = ViewModelSecondScreen()) }
        composable(route = AppScreens.NuevaGuardiaScreen.route) { NuevaGuardiaScreen(navController, mvvm = ViewModelGuardia()) }
        composable(route = AppScreens.GuardiasScreen.route){ GuardiasScreen(navController, mvvm = ViewModelGuardia()) }
    }
}
