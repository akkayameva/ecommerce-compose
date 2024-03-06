package com.akkayameva.ecommerce.presentation.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.akkayameva.core.domain.model.Product
import com.akkayameva.ecommerce.presentation.detail.composables.DetailBottomBar
import com.akkayameva.ecommerce.presentation.detail.composables.DetailTopBar

@Composable
fun DetailScreen(
    product: Product,
) {
    Scaffold(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp),
        topBar = { DetailTopBar() },
        bottomBar = { DetailBottomBar(product = product) }
    ) { paddingValues ->
        Column(
            Modifier.padding(paddingValues)
        ) {  Image(
            modifier = Modifier
                .fillMaxWidth()
                .aspectRatio(1.7f)
                .clip(RoundedCornerShape(10.dp))
                .background(Color(0xFFE9E9E9))
                .padding(all = 12.dp),
            painter = rememberAsyncImagePainter(model = product.imageUrl),
            contentDescription = product.name + " Image"
        )
        }
    }
}

@Composable
@Preview(showBackground = true)
fun DetailScreenPreview() {
    DetailScreen(product = Product.DUMMY.random())
}