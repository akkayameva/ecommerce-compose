package com.akkayameva.core.data.repository.bag

import com.akkayameva.core.data.source.local.LocalDataSource
import com.akkayameva.core.domain.model.Product
import com.akkayameva.core.domain.repository.bag.BagRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class BagRepositoryImpl(
    val localDataSource: LocalDataSource
): BagRepository {
    override fun getBagProduct(): Flow<List<Product>> {
        return TODO("Provide the return value")
    }
}