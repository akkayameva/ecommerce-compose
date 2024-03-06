package com.akkayameva.core.data.repository.detail

import com.akkayameva.core.data.source.local.LocalDataSource
import com.akkayameva.core.domain.model.Product
import com.akkayameva.core.domain.repository.detail.DetailRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch

class DetailRepositoryImpl(
    private val localDataSource: LocalDataSource
): DetailRepository {

    override suspend fun addToBagProduct(product: Product) {
        CoroutineScope(Dispatchers.IO).launch {
//            localDataSource.insertBagProduct(product.toEntity())
        }
    }

    override suspend fun removeFromBagProduct(product: Product) {
        CoroutineScope(Dispatchers.IO).launch {
//            localDataSource.deleteBagProduct(product.toEntity())
        }
    }

    override fun isProductOnBag(id: Int): Flow<Boolean> {
        return flow {
//            localDataSource.getBagProductById(id).collect { entity ->
//                emit(entity != null)
            }
    }
}