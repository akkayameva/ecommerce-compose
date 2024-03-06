package com.akkayameva.ecommerce.utils

object Extension {
    fun String.firstThirdWords(): String {
        return split(" ").take(3).joinToString(" ")
    }
}