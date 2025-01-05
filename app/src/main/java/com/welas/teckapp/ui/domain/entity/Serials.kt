package com.welas.teckapp.ui.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "serials")
data class Serials(
    @PrimaryKey(autoGenerate = true) val serialId: Int = 0,
    val itemId: Int = 0,
    val isActive: Boolean = true,
    val serial: String = "",
    val creationDate: String = "",
    val createdBy: String = "",
    val updateDate: String = "",
    val updatedBy: String = "",
)
