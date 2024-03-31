package com.cs4520.assignment5

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(
    navController: NavHostController,
//    vm: HomeScreenViewModel = viewModel()
) {
    Text(text = "Home Screen")
}