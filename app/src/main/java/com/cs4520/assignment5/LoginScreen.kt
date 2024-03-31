package com.cs4520.assignment5

import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

@Composable
fun LoginScreen(
    navController: NavHostController,
//    vm: HomeScreenViewModel = viewModel()
) {
    Button(onClick = {
        navController.navigate(Screen.HOME.name)
    }) {
        Text(text = "Login")
    }
}