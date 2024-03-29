package com.akkayameva.ecommerce.presentation.home.composables

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.navigation.DestinationsNavigator

@Composable
fun HomeTopBar(navigator: DestinationsNavigator) {
    TopAppBar(
        modifier = Modifier.padding(end = 16.dp),
        backgroundColor = Color.Transparent,
        elevation = 0.dp,
        title = { Text(text = "E-Commerce", fontWeight = FontWeight.Bold) },
        actions = {
            Icon(modifier = Modifier.clickable {
               // navigator.navigate()
            },imageVector = Icons.Outlined.ShoppingCart, contentDescription = "shopping cart icon", tint = Color.Black)
        }
    )
}