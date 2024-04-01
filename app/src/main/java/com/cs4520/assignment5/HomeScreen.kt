package com.cs4520.assignment5

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen(
//    vm: HomeScreenViewModel = viewModel()
) {
    val products = listOf<Product>(
        Product(
            "Apple_1710281919", "Food", "2024-02-05", 1.5,
            ),
        Product(
            "Treadmill_1710281919", "Equipment", null, 500.0
        ))

    Column(
        modifier = Modifier.fillMaxSize(),
        ) {
        for (product in products) {
            ProductRow(product)
        }
    }

}

@Composable
fun ProductRow(product: Product) {
    val image = if (product.type == "Food") R.drawable.food else R.drawable.equipment
    val background = if (product.type == "Food") Color.Yellow else Color.Red

    Row(
        Modifier.fillMaxWidth().background(background).padding(20.dp)
//        Modifier.background(Color(background))
    ) {
        Image(
            painter = painterResource(id = image),
            contentDescription = "Product picture",
            Modifier.size(100.dp, 100.dp)
        )
        Column() {
            Text(text = product.name)
            product.expiryDate?.let {
                Text(text = product.expiryDate)
            }
            Text(text = product.price.toString())
        }
    }
}
