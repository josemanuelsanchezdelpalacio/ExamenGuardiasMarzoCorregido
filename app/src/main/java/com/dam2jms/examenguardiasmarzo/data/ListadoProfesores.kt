package com.dam2jms.examenguardiasmarzo.data

import com.dam2jms.examenguardiasmarzo.R

//litado con cada profesor, su password y su horario
val profesor1: Profesor = Profesor(nombreProfesor = "Juan García", password = 28112437, horario = R.drawable.juan_garcia)
val profesor2: Profesor = Profesor(nombreProfesor = "Pedro Pérez", password = 17909081, horario = R.drawable.pedro_perez)
val profesor3: Profesor = Profesor(nombreProfesor = "Ana Laínez", password = 18450692, horario = R.drawable.ana_lainez)
val profesor4: Profesor = Profesor(nombreProfesor = "Marcos Flores", password = 22045989, horario = R.drawable.marcos_flores)
val profesor5: Profesor = Profesor(nombreProfesor = "María Lozano", password = 19270097, horario = R.drawable.maria_lozano)
val profesor6: Profesor = Profesor(nombreProfesor = "Gloria Fontana", password = 21302887, horario = R.drawable.gloria_fontana)
val profesor7: Profesor = Profesor(nombreProfesor = "Juana Laruns", password = 21200125, horario = R.drawable.juana_laruns)


val listadoProfesores: List<Profesor> = listOf(profesor1, profesor2, profesor3, profesor4, profesor5, profesor6, profesor7)