package com.akkayameva.core.domain.usecase.detail


import com.akkayameva.core.domain.model.Product
import com.akkayameva.core.domain.repository.detail.DetailRepository
import kotlinx.coroutines.flow.Flow


class DetailInteractor(val detailRepository: DetailRepository): DetailUseCase {
    override suspend fun addToBagProduct(product: Product) {
        detailRepository.addToBagProduct(product)
    }

    override suspend fun removeFromBagProduct(product: Product) {
        detailRepository.removeFromBagProduct(product)
    }

    override fun isProductOnBag(id: Int): Flow<Boolean> {
        return detailRepository.isProductOnBag(id)
    }
}