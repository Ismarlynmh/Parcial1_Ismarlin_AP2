package com.mendozacreations.parcial1_ismarlin_ap2.data.repository

import com.mendozacreations.parcial1_ismarlin_ap2.data.PrestamoDao
import com.mendozacreations.parcial1_ismarlin_ap2.model.Prestamo
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class PrestamoRepository @Inject constructor(
    val prestamosDao: PrestamoDao
){
    suspend fun insertar(prestamos: Prestamo){
        prestamosDao.insertar(prestamos = prestamos)
    }
    suspend fun eliminar(prestamos: Prestamo){
        prestamosDao.eliminar(prestamos = prestamos)
    }

    fun buscar(prestamoId : Int) : Flow<Prestamo> {
        return prestamosDao.buscar(prestamoId = prestamoId)
    }

    fun getList() : Flow<List<Prestamo>>{
        return prestamosDao.getList()
    }
}