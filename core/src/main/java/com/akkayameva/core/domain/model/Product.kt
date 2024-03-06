package com.akkayameva.core.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class Product(
    val id: Int,
    val name: String,
    val price: String,
    val currency: String,
    val imageUrl: String,
    val color: String,
    val category: String
): Parcelable  {

    companion object{
        val DUMMY = List(5){
            Product(
                id = 123,
                name = "Long Sleeve Sweater",
                category = "sweater",
                price = "39.9",
                currency = "USD",
                imageUrl = "",
                color = "white"
            )
        }
    }
}


