package com.welas.teckapp.ui.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "paymentMethod")
data class PaymentMethod(
    @PrimaryKey(autoGenerate = true) val paymentMethodId: Int = 0,
    var code: String = "",
    var description: String = "",
    val isDolar: Boolean = false,
    val isActive: Boolean = true,
    val creationDate: String = "",
    val createdBy: String = "",
    val updateDate: String = "",
    val updatedBy: String = "",
)