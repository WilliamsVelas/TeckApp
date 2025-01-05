package com.welas.teckapp.ui.Composables.ResableCards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.welas.teckapp.ui.theme.principalCardBackground
import com.welas.teckapp.ui.theme.principalWhite

@Composable
fun UserCard() {
    IconButton(modifier = Modifier.size(45.dp), onClick = { /*TODO*/ }) {
        Icon(
            modifier = Modifier.fillMaxSize(),
            imageVector = Icons.Default.AccountCircle,
            contentDescription = "",
            tint = principalWhite
        )
    }
}