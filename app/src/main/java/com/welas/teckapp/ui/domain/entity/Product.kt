package com.welas.teckapp.ui.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "product")
data class Product(
    @PrimaryKey(autoGenerate = true) val productId: Int = 0,
    val code: String = "",
    val name: String = "",
    val categoryId: Int = 0,
    val isActive: Boolean = true,
    val tax: String = "",
    val price: Double = 0.0,
    val totalPrice: Double = 0.0,
    val stock: Double = 0.0,
    val creationDate: String = "",
    val createdBy: String = "",
    val updateDate: String = "",
    val updatedBy: String = "",
)