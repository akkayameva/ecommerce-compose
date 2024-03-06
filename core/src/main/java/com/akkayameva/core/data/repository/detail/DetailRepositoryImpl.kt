package com.akkayameva.core.data.repository.detail

import com.akkayameva.core.data.source.local.LocalDataSource
import com.akkayameva.core.domain.model.Product
import com.akkayameva.core.domain.repository.detail.DetailRepository

class DetailRepositoryImpl(
    val localDataSource: LocalDataSource
): DetailRepository {
    override suspend fun addToBagProduct(product: Product) {
        TODO("Not yet implemented")
    }

    override suspend fun removeFromBagProduct(product: Product) {
        TODO("Not yet implemented")
    }
}