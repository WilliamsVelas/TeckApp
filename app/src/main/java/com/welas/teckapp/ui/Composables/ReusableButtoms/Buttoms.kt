package com.welas.teckapp.ui.Composables.ReusableButtoms

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

@Composable
fun ModificableButton(
    onClick: () -> Unit,
    fontColor: Color,
    contentColor: Color,
    title: String,
    width: Float = 1.0f
) {
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        Button(
            modifier = Modifier.fillMaxWidth(width),
            onClick = { onClick() },
            shape = RoundedCornerShape(22.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = contentColor,
                containerColor = contentColor,
                disabledContentColor = contentColor
            ),
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title, style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        color = fontColor
                    )
                )
            }
        }
    }
}