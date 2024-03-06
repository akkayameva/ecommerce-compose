package com.akkayameva.core.domain.usecase.detail

import com.akkayameva.core.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface DetailUseCase {
    suspend fun addToBagProduct(product: Product)
    suspend fun removeFromBagProduct(product: Product)

    fun isProductOnBag(id: Int): Flow<Boolean>
}