package com.mendozacreations.parcial1_ismarlin_ap2.data

import androidx.room.*
import com.mendozacreations.parcial1_ismarlin_ap2.model.Prestamo
import kotlinx.coroutines.flow.Flow

@Dao
interface PrestamoDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertar(prestamos: Prestamo)

    @Delete
    suspend fun eliminar(prestamos: Prestamo)

    @Query("SELECT * FROM Prestamos WHERE prestamoId=:prestamoId")
    fun buscar(prestamoId : Int) : Flow<Prestamo>

    @Query("SELECT * FROM Prestamos ORDER BY prestamoId")
    fun getList() : Flow<List<Prestamo>>
}