package com.akkayameva.core.domain.usecase.detail

import com.akkayameva.core.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface DetailUseCase {
    fun addToBagProduct(product: Product)
    fun removeFromBagProduct(product: Product)
    fun isProductOnBag(id: Int): Flow<Boolean>
}