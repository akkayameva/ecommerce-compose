package com.akkayameva.core.domain.usecase.detail

import com.akkayameva.core.domain.model.Product

interface DetailUseCase {
    suspend fun addToBagProduct(product: Product)
    suspend fun removeFromBagProduct(product: Product)
}