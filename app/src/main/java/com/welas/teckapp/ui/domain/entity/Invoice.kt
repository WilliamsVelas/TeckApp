package com.welas.teckapp.ui.domain.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "invoice")
data class Invoice(
    @PrimaryKey(autoGenerate = true) val invoiceId: Int = 0,
    val isActive: Boolean = true,
    val docType: String = "",
    val invoiceNumber: String = "",
    val businessPartnerId: String = "",
    val taxBase: Double = 0.0,
    val taxAmount: Double = 0.0,
    val totalInvoice: Double = 0.0,
    val totalToPay: Double = 0.0,
    val creationDate: String = "",
    val createdBy: String = "",
    val updateDate: String = "",
    val updatedBy: String = "",
)