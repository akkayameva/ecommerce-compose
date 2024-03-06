package com.akkayameva.core.domain.usecase.detail


import com.akkayameva.core.domain.model.Product
import com.akkayameva.core.domain.repository.detail.DetailRepository


class DetailInteractor(val detailRepository: DetailRepository): DetailUseCase {
    override suspend fun addToBagProduct(product: Product) {
        detailRepository.addToBagProduct(product)
    }

    override suspend fun removeFromBagProduct(product: Product) {
        detailRepository.removeFromBagProduct(product)
    }
}