package com.mendozacreations.parcial1_ismarlin_ap2.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.runtime.Composable
import com.mendozacreations.parcial1_ismarlin_ap2.model.Prestamo
import androidx.compose.material.Text

@Composable
fun RowPrestamo (prestamo: Prestamo) {
    Row() {
        Text(text = prestamo.deudor +"\n"+ prestamo.concepto+"\t"+prestamo.monto)
    }
}