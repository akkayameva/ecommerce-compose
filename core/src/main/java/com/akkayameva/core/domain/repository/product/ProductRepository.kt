package com.akkayameva.core.domain.repository.product


import com.akkayameva.core.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductRepository {
    fun getAllProducts(): Flow<List<Product>>
}