package com.cs4520.assignment5

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

/**
 * Composable for the login screen of the app.
 * Should be first screen viewed when opening the app.
 */
@Composable
fun LoginScreen(
    navController: NavHostController,
) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        ) {
        val context = LocalContext.current
        var nameInput by remember { mutableStateOf("") }
        var passwordInput by remember { mutableStateOf("") }

        TextField(value = nameInput,
            onValueChange = { nameInput = it },
            label = { Text("Username") },
            modifier = Modifier.padding(2.dp)
        )
        TextField(value = passwordInput, onValueChange = { passwordInput = it }, label = { Text("Password") })
        Button(onClick = {
            if (nameInput == "admin" && passwordInput == "admin") {
                navController.navigate(Screen.HOME.name)
            } else {
                val toast = Toast.makeText(
                    context,
                    "Invalid user credentials",
                    Toast.LENGTH_SHORT)
                toast.show()
            }
        }) {
            Text(text = "Login")
        }
    }
}