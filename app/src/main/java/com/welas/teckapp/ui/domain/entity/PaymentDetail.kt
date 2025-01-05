package com.welas.teckapp.ui.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "paymentDetail")
data class PaymentDetail(
    @PrimaryKey(autoGenerate = true) val paymentDetailId: Int = 0,
    val paymentMethodId: Int = 0,
    val invoiceId: Int = 0,
    val documentNumber: String = "",
    val amount: Double = 0.0,
    val isFullPayed: Boolean = false,
    val creationDate: String = "",
    val createdBy: String = "",
    val updateDate: String = "",
    val updatedBy: String = "",
)