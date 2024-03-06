package com.akkayameva.core.data.source.local

import com.akkayameva.core.data.source.local.room.dao.ProductDAO
import com.akkayameva.core.data.source.local.room.entity.ProductEntity
import kotlinx.coroutines.flow.Flow

class LocalDataSource(
    private val productDAO: ProductDAO,
) {
    fun getBagProductList(): Flow<List<ProductEntity>> {
        return productDAO.getBagProductList()
    }

    fun getBagProductById(id: Int): Flow<ProductEntity?> {
        return productDAO.getBagProductById(id)
    }

    suspend fun insertBagProduct(productEntity: ProductEntity){
        productDAO.insertBagProduct(productEntity)
    }

    suspend fun deleteBagProduct(productEntity: ProductEntity){
        productDAO.deleteBagProduct(productEntity)
    }
}