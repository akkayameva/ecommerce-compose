package com.akkayameva.core.data.repository.product

import com.akkayameva.core.data.source.remote.RemoteDataSource
import com.akkayameva.core.domain.model.Product
import com.akkayameva.core.domain.repository.product.ProductRepository
import com.akkayameva.core.utils.DataMapper.toModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class ProductRepositoryImpl(
    private val remoteDataSource: RemoteDataSource,
): ProductRepository {
    override fun getAllProducts(): Flow<List<Product>> {
        return flow {
            val listProduct = remoteDataSource.getAllProduct().map { dto ->
                dto.toModel()
            }.sortedBy { it.price.toDouble() }
            emit(listProduct)
        }
    }
}