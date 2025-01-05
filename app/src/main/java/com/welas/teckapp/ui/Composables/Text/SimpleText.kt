package com.welas.teckapp.ui.Composables.Text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.welas.teckapp.ui.theme.fontSemiWhite

@Composable
fun SimpleText(text: String, fontSize: TextUnit = 22.sp, fontColor: Color = fontSemiWhite, fontWeight: FontWeight = FontWeight.Bold) {
    Text(
        text = text, style = TextStyle(
            fontWeight = fontWeight,
            fontSize = fontSize,
            color = fontColor
        )
    )
}