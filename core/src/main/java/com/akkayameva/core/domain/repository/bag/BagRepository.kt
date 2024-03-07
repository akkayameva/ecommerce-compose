package com.akkayameva.core.domain.repository.bag

import com.akkayameva.core.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface BagRepository {
    fun getBagProduct(): Flow<List<Product>>
}