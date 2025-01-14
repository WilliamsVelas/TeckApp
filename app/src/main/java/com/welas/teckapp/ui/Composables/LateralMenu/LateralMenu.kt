package com.welas.teckapp.ui.Composables.LateralMenu

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DrawerState
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.welas.teckapp.screens.HomeScreen.HomeScreen
import com.welas.teckapp.ui.Composables.ResableCards.MenuCard
import com.welas.teckapp.ui.Composables.ResableCards.UserCard
import com.welas.teckapp.ui.theme.fontWhite
import com.welas.teckapp.ui.theme.principalBackground
import kotlinx.coroutines.launch

@Composable
fun DrawerContent(navController: NavController, onCloseDrawer: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth(0.6f)
            .background(principalBackground), horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
            Text(
                text = "Menú.",
                style = TextStyle(
                    fontWeight = FontWeight.Bold,
                    fontSize = 24.sp,
                    color = Color.Black
                ),
                modifier = Modifier.padding(bottom = 16.dp)
            )
        }


        val routes = listOf("Home")
        routes.forEach { route ->
            Card(
                modifier = Modifier
                    .fillMaxWidth(.8f)
                    .padding(vertical = 12.dp)
                    .clickable {
                        navController.navigate(route)
                        onCloseDrawer()
                    },
                shape = RoundedCornerShape(12.dp),
                colors = CardDefaults.cardColors(
                    containerColor = Color.White,
                    contentColor = Color.Black
                )
            ) {
                Text(
                    text = route,
                    modifier = Modifier.padding(16.dp),
                    style = TextStyle(fontSize = 18.sp)
                )
            }
        }
    }
}

@Composable
fun MenuScaffold(drawerState: DrawerState){
    val navController = rememberNavController()
    val coroutineScope = rememberCoroutineScope()

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            Row(
                modifier = Modifier
                    .fillMaxWidth().background(principalBackground)
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                MenuCard(
                    drawerState = drawerState,
                    onOpenDrawer = {
                        coroutineScope.launch { drawerState.open() }
                    }
                )
                Text(
                    modifier = Modifier.weight(1f),
                    text = "Bienvenido, usuario",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp,
                        color = fontWhite
                    )
                )
                UserCard()
            }
        },
        content = { innerPadding ->
            NavHost(
                navController = navController,
                startDestination = "home",
                modifier = Modifier.padding(innerPadding)
            ) {
                composable("home") {
                    HomeScreen()
                }
            }
        }
    )
}

