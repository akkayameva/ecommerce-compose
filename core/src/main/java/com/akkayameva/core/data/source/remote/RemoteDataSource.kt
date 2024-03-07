package com.akkayameva.core.data.source.remote

import com.akkayameva.core.data.source.remote.api.ProductApi
import com.akkayameva.core.data.source.remote.dto.ProductDTO


class RemoteDataSource(
    private val productApi: ProductApi
) {

    suspend fun getAllProduct(): List<ProductDTO> {
        return productApi.getAllProduct()
    }
}