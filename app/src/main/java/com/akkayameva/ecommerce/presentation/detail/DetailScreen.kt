package com.akkayameva.ecommerce.presentation.detail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.akkayameva.core.domain.model.Product
import com.akkayameva.ecommerce.presentation.detail.composables.DetailTopBar

@Composable
fun DetailScreen(
    product: Product,
) {
    Scaffold(
        modifier = Modifier.fillMaxSize().padding(horizontal = 16.dp),
        topBar = { DetailTopBar() }
    ) { paddingValues ->
        Column(
            Modifier.padding(paddingValues)
        ) {

        }
    }
}



@Composable
@Preview(showBackground = true)
fun DetailScreenPreview() {
    DetailScreen(product = Product.DUMMY.random())
}