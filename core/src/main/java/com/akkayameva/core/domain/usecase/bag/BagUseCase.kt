package com.akkayameva.core.domain.usecase.bag

import com.akkayameva.core.domain.model.Product
import kotlinx.coroutines.flow.Flow

interface BagUseCase {
    fun getBagProduct(): Flow<List<Product>>
}