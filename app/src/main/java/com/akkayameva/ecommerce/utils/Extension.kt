package com.akkayameva.ecommerce.utils

object Extension {
    fun String.firstTwoWords(): String {
        return split(" ").take(2).joinToString(" ")
    }
}