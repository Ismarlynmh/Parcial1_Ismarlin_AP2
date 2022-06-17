package com.mendozacreations.parcial1_ismarlin_ap2.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.mendozacreations.parcial1_ismarlin_ap2.model.Prestamo
import com.mendozacreations.parcial1_ismarlin_ap2.ui.theme.Parcial1_Ismarlin_AP2Theme



@Composable
fun RowPrestamo (prestamo: Prestamo) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(30.dp)
                .padding(2.dp)
            ,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = prestamo.deudor)
            Text(text = prestamo.monto.toString(),
                style = MaterialTheme.typography.h5
            )
        }

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start
        ) {
            Text(text = prestamo.concepto,
                style = MaterialTheme.typography.caption
            )
        }
    }
}