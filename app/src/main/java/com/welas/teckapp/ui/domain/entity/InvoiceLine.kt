package com.welas.teckapp.ui.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "invoiceLine")
data class InvoiceLine(
    @PrimaryKey(autoGenerate = true) val invoiceLineId: Int = 0,
    val isActive: Boolean = true,
    val invoiceId: String = "",
    val productId: String = "",
    val productDescription: String = "",
    val productCode: String = "",
    val productTax: String = "",
    val quantity: Double = 0.0,
    val unitPrice: Double = 0.0,
    val totalAmount: Double = 0.0,
    val creationDate: String = "",
    val createdBy: String = "",
    val updateDate: String = "",
    val updatedBy: String = "",
)