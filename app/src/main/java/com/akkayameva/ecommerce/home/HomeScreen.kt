package com.akkayameva.ecommerce.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

import com.akkayameva.core.domain.model.Product
import com.akkayameva.ecommerce.home.composables.HomeTopBar

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(){
    var listProduct = listOf<Product>()
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { HomeTopBar() }
    ) { paddingValues ->
    }
}



@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen()
}