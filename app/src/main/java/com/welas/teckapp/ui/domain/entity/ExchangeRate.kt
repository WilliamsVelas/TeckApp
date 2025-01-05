package com.welas.teckapp.ui.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "exchangeRate")
data class ExchangeRate(
    @PrimaryKey(autoGenerate = true) val exchangeRateId: Int = 0,
    val isActive: Boolean = true,
    val amount: Double = 0.0,
    val date: String = "",
    val creationDate: String = "",
    val createdBy: String = "",
    val updateDate: String = "",
    val updatedBy: String = "",
)