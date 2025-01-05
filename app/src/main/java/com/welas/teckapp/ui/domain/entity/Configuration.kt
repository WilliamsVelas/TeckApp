package com.welas.teckapp.ui.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "configuration")
data class Configuration(
    @PrimaryKey(autoGenerate = true) val configurationId: Int = 0,
    val darkTheme: Boolean = true,
    val creationDate: String = "",
    val createdBy: String = "",
    val updateDate: String = "",
    val updatedBy: String = "",
)