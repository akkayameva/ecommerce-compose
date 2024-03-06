package com.akkayameva.core.utils

import com.akkayameva.core.data.source.local.room.entity.ProductEntity
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

    fun Product.toEntity(): ProductEntity {
        return ProductEntity(
            id = id,
            name = name,
            price = price,
            currency = currency,
            imageUrl = imageUrl,
            color = color,
            category = category
        )
    }

    fun ProductEntity.toModel(): Product {
        return Product(
            id = id,
            name = name,
            price = price,
            currency = currency,
            imageUrl = imageUrl,
            color = color,
            category = category
        )
    }
}