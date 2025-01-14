package com.welas.teckapp.core.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.systemBars
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.welas.teckapp.screens.HomeScreen.HomeScreen
import com.welas.teckapp.ui.Composables.LateralMenu.DrawerContent
import com.welas.teckapp.ui.Composables.LateralMenu.MenuScaffold
import com.welas.teckapp.ui.Composables.ResableCards.MenuCard
import com.welas.teckapp.ui.Composables.ResableCards.UserCard
import com.welas.teckapp.ui.theme.fontWhite
import com.welas.teckapp.ui.theme.principalBackground
import kotlinx.coroutines.launch

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()

    Box(
        modifier = Modifier
            .fillMaxSize().background(principalBackground)
    ) {
        ModalNavigationDrawer(
            drawerState = drawerState,
            modifier = Modifier.padding(WindowInsets.statusBars.asPaddingValues()),
            drawerContent = {
                DrawerContent(
                    navController = navController,
                    onCloseDrawer = {
                        coroutineScope.launch { drawerState.close() }
                    }
                )
            }
        ) {
            MenuScaffold(drawerState)
        }
    }
}




