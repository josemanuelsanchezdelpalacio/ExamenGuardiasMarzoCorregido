package com.dam2jms.examenguardiasmarzo.states

data class UiState(
    var nombreProfesor: String = "",
    var password: String = "",
    var fecha: String = "",
    var time: String = "",
    var numeroGuardias: Int = 0
)