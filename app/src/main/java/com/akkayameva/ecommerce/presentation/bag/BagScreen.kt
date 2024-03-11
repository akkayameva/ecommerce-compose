package com.akkayameva.ecommerce.presentation.bag

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.akkayameva.core.domain.model.Product
import com.akkayameva.ecommerce.presentation.bag.composables.BagTopBar
import com.akkayameva.ecommerce.presentation.home.composables.ProductGrid


@Composable
fun BagScreen(){
    val listProduct = Product.DUMMY
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { BagTopBar() }
    ){ paddingValues ->
        ProductGrid(
            modifier = Modifier.padding(paddingValues),
            listProduct = listProduct,
        )
    }
}

@Composable
@Preview(showBackground = true)
fun CartScreenPreview() {
    BagScreen()
}