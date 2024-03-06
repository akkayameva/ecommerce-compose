package com.akkayameva.core.utils

import com.akkayameva.core.data.source.remote.dto.ProductDTO
import com.akkayameva.core.domain.model.Product

class DataMapper {
    fun ProductDTO.toModel(): Product {
        return Product(
            id = id ?: 0,
            name = name.orEmpty(),
            price = (price ?: 0).toString(),
            currency = currency ?: "USD",
            imageUrl = imageName.orEmpty(),
            color = color,
            category = category ?: "No category"
        )
    }
}