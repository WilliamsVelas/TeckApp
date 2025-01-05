package com.welas.teckapp.ui.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "image")
data class Image(
    @PrimaryKey(autoGenerate = true) val imageId: Int = 0,
    val fileObjectId: Int = 0,
    val filePath: String = "",
)