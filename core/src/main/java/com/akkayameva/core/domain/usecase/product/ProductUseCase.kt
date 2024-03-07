package com.akkayameva.core.domain.usecase.product


import com.akkayameva.core.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface ProductUseCase {
    fun getAllProducts(): Flow<List<Product>>
}