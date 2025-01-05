package com.welas.teckapp.ui.domain.entity

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class User (
    @PrimaryKey(autoGenerate = true) val userId: Int = 0,
    val value: String = "",
    val name: String = "",
    val username: String = "",
    val password: String = "",
    val isActive: Boolean = true,
    val creationDate: String = "",
    val createdBy: String = "",
    val updateDate: String = "",
    val updatedBy: String = "",
)