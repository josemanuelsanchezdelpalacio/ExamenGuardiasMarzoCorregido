package com.dam2jms.examenguardiasmarzo.models

import android.content.Context
import android.widget.Toast
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.dam2jms.examenguardiasmarzo.data.listadoProfesores
import com.dam2jms.examenguardiasmarzo.navigation.AppScreens
import com.dam2jms.examenguardiasmarzo.states.UiState
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class ViewModelFirstScreen : ViewModel() {
    private val _uiState = MutableStateFlow(UiState())
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    fun onChangeUsuario(nombreProfesor: String) {
        _uiState.update { currentState ->
            currentState.copy(nombreProfesor = nombreProfesor)
        }
    }

    fun onChangeContraseña(password: String) {
        _uiState.update { currentState ->
            currentState.copy(password = password)
        }
    }

    fun iniciarSesion(navController: NavController, context: Context) {
        val nombreUsuario = _uiState.value.nombreProfesor
        val password = _uiState.value.password.toInt()

        val profesor = listadoProfesores.find {
            it.nombreProfesor[0].toLowerCase() + it.nombreProfesor.split(" ")[1].toLowerCase().replace("á", "a").replace("é", "e").replace("í", "i").replace("ó", "o").replace("ú", "u") == nombreUsuario && it.password.toString().takeLast(5).toInt() == password
        }

        if (profesor != null) {
            navController.navigate(AppScreens.SecondScreen.route)
            Toast.makeText(context, "El usuario ${nombreUsuario} es correcto\n", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(context, "El usuario ${nombreUsuario} no es correcto. Prueba otra vez\n", Toast.LENGTH_SHORT).show()
        }
    }

}
