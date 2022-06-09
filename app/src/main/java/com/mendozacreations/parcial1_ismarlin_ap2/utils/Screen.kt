package com.mendozacreations.parcial1_ismarlin_ap2.utils

sealed class Screen (val route :String){
    object RegistroScreen : Screen("Registro")
    object ConsultaScreen : Screen("Consulta")
}