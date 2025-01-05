package com.welas.teckapp.ui.domain.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "businessPartner")
data class BusinessPartner(
    @PrimaryKey(autoGenerate = true) val businessPartnerId: Int = 0,
    val email: String = "",
    val value: String = "",
    val businessName: String = "",
    val address: String = "",
    val phoneNumber: String = "",
    val tradeName: String = "",
    val isActive: Boolean = true,
    val isProvider: Boolean = true,
    val isClient: Boolean = true,
    val creationDate: String = "",
    val createdBy: String = "",
    val updateDate: String = "",
    val updatedBy: String = "",
)