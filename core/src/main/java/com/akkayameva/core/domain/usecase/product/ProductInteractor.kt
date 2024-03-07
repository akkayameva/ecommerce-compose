package com.akkayameva.core.domain.usecase.product


import com.akkayameva.core.domain.model.Product
import com.akkayameva.core.domain.repository.product.ProductRepository
import kotlinx.coroutines.flow.Flow

class ProductInteractor(
    private val searchRepository: ProductRepository
): ProductUseCase {
    override fun getAllProducts(): Flow<List<Product>> {
        return searchRepository.getAllProducts()
    }
}