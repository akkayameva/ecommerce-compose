package com.akkayameva.core.domain.usecase.bag

import com.akkayameva.core.domain.model.Product
import com.akkayameva.core.domain.repository.bag.BagRepository
import com.akkayameva.core.domain.usecase.bag.BagUseCase
import kotlinx.coroutines.flow.Flow

class BagInteractor(val bagRepository: BagRepository): BagUseCase {
    override fun getBagProduct(): Flow<List<Product>> {
        return bagRepository.getBagProduct()
    }
}