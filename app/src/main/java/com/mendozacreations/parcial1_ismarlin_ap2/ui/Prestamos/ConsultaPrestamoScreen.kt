package com.mendozacreations.parcial1_ismarlin_ap2.ui.Prestamos

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavHostController
import com.mendozacreations.parcial1_ismarlin_ap2.ui.components.RowPrestamo
import com.mendozacreations.parcial1_ismarlin_ap2.utils.Screen

@Composable
fun ConsultaPrestamoScreen(
    navHostController: NavHostController,
    viewModel: PrestamoViewModel = hiltViewModel()
) {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = "Consulta") }
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = {
                navHostController.navigate(Screen.RegistroScreen.route)
            }) {
                Icon(imageVector = Icons.Default.Add, contentDescription = null)
            }
        }
    ) {
        Column(modifier = Modifier
            .padding(it)
            .padding(8.dp)
        ){
            val lista = viewModel.prestamos.collectAsState(initial = emptyList())
            LazyColumn(modifier = Modifier.fillMaxWidth()){
                items(lista.value){
                        prestamo -> RowPrestamo(prestamo = prestamo)
                    Spacer(
                        modifier = Modifier.height(3.dp)
                    )

                    Divider(
                        modifier = Modifier.fillMaxWidth().width(2.dp), color = Color.DarkGray
                    )

                    Spacer(
                        modifier = Modifier.height(3.dp)
                    )
                }
            }
        }
    }
}