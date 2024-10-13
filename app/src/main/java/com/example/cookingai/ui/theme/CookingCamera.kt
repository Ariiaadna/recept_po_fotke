package com.example.cookingai.ui.theme

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavController

@Composable
public fun CookingCamera(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,) {
        Text(text = "В будущем тут будет камера, но пока только кнопочка")
        Button(
            onClick = {
                navController.navigate("MainScreen")
            },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF98d7ff))
        ) {
            Text(text = "Назад в меню")
        }
    }
}