package com.mendozacreations.parcial1_ismarlin_ap2.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.mendozacreations.parcial1_ismarlin_ap2.model.Prestamo

@Database(
    entities = [
        Prestamo::class
    ],
    exportSchema = false,
    version = 1
)
abstract class PrestamosDb : RoomDatabase() {
    abstract val prestamosDao : PrestamoDao
}