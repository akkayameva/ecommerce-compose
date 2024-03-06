package com.akkayameva.core.data.source.remote.api

import com.akkayameva.core.data.source.remote.dto.ProductDTO

interface ProductApi {
    suspend fun getAllProduct(): List<ProductDTO>
}