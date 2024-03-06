package com.akkayameva.core.domain.repository.detail

import com.akkayameva.core.domain.model.Product

interface DetailRepository {
    suspend fun addToBagProduct(product: Product)
    suspend fun removeFromBagProduct(product: Product)

}