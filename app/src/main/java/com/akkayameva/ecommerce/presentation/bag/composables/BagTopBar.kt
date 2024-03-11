package com.akkayameva.ecommerce.presentation.bag.composables

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun BagTopBar() {
    TopAppBar(
        modifier = Modifier.padding(end = 16.dp),
        backgroundColor = Color.Transparent,
        elevation = 0.dp,
        title = { Text(text = "Your Bag", fontWeight = FontWeight.Bold) }
    )
}