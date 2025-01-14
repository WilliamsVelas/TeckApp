package com.welas.teckapp.screens.HomeScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.welas.teckapp.ui.Composables.ResableCards.LastSellCard
import com.welas.teckapp.ui.Composables.ResableCards.MenuCard
import com.welas.teckapp.ui.Composables.ResableCards.UserCard
import com.welas.teckapp.ui.Composables.ReusableButtoms.ModificableButton
import com.welas.teckapp.ui.theme.*


@Composable
fun HomeScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(principalBackground)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 20.dp, horizontal = 6.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            //Button to set a new sell
            ModificableButton(
                onClick = {},
                fontColor = fontBlack,
                contentColor = principalButton,
                title = "Nueva Venta",
                width = .9f,
            )

            //Stats Cards
            Row(modifier = Modifier.fillMaxWidth()) {
                LastSellCard()
            }
        }
    }
}
