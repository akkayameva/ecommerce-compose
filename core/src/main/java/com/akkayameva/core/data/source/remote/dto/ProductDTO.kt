package com.akkayameva.core.data.source.remote.dto

import kotlinx.serialization.SerialName

data class ProductDTO(
    val id: Int? = null,
    val price: Double? = null,
    @SerialName("image_name")
    val imageName: String? = null,
    val currency: String? = null,
    val name: String? = null,
    val category: String? = null,
    val color: String
)