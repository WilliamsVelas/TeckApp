package com.welas.teckapp.ui.Composables.ResableCards

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.welas.teckapp.ui.Composables.Text.SimpleText
import com.welas.teckapp.ui.theme.fontSemiWhite
import com.welas.teckapp.ui.theme.fontWhite
import com.welas.teckapp.ui.theme.principalCardBackground

@Composable
fun LastSellCard() {
    Card(
        modifier = Modifier
            .size(width = 200.dp, height = 100.dp),
        colors = CardDefaults.cardColors(
            containerColor = principalCardBackground,
            contentColor = principalCardBackground
        ),
        shape = RoundedCornerShape(22.dp),
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalArrangement = Arrangement.SpaceAround
        ) {
            SimpleText("Ultima Venta")
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                SimpleText("Jose", 18.sp, fontWhite, FontWeight.SemiBold)
                SimpleText("Q3", 18.sp, fontWhite, FontWeight.SemiBold)
            }
        }

    }
}