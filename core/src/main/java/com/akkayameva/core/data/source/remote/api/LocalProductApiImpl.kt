package com.akkayameva.core.data.source.remote.api


import com.akkayameva.core.data.source.remote.dto.ProductDTO
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlinx.serialization.decodeFromString

class LocalProductApiImpl: ProductApi {

    private val json = """
        {
        "products": [
            {
                "id": 19408,
                "price": 39.9,
                "name": "Long Sleeve Sweater",
                "category": "Sweater",
                "currency": "USD",
                "image_name": "long-sleeve-sweater",
                "color": "White"
            },
            {
                "id": 17936,
                "price": 99.9,
                "name": "Long Coat",
                "category": "Coat",
                "currency": "USD",
                "image_name": "long-coat",
                "color": "Black"
            },
            {
                "id": 14536,
                "price": 17.9,
                "name": "Rain Coat",
                "category": "Coat",
                "currency": "USD",
                "image_name": "rain-coat",
                "color": "White"
            },
            {
                "id": 18218,
                "price": 49.9,
                "name": "Printed Midi Dress",
                "category": "Dress",
                "currency": "USD",
                "image_name": "printed-midi-dress",
                "color": "Blue"
            },
            {
                "id": 12816,
                "price": 89.9,
                "name": "Blazer Coat",
                "category": "Coat",
                "currency": "USD",
                "image_name": "blazer-coat",
                "color": "Black"
            },
            {
                "id": 11189,
                "price": 29.9,
                "name": "Scoop Neck Mini Dress",
                "category": "Dress",
                "currency": "USD",
                "image_name": "scoop-neck-midi-dress",
                "color": "Black"
            },
            {
                "id": 17238,
                "price": 129.9,
                "name": "Short Sleeve Sweater",
                "category": "Sweater",
                "currency": "USD",
                "image_name": "short-sleeve-sweater",
                "color": "White"
            },
            {
                "id": 16108,
                "price": 39.0,
                "name": "Party Dress",
                "category": "Dress",
                "currency": "USD",
                "image_name": "party-dress",
                "color": "Blue"
            },
            {
                "id": 12408,
                "price": 39.95,
                "name": "Winter Coat",
                "category": "Coat",
                "currency": "USD",
                "image_name": "winter-coat",
                "color": "White"
            },
            {
                "id": 12348,
                "price": 119.55,
                "name": "Casual Dress",
                "category": "Dress",
                "currency": "USD",
                "image_name": "casual-dress",
                "color": "Black"
            }
        ]
        }
    """.trimIndent()

    override suspend fun getAllProduct(): List<ProductDTO> {
        return Json.decodeFromString<ProductList>(json).products
    }
    @Serializable
    data class ProductList(val products: List<ProductDTO>)
}
