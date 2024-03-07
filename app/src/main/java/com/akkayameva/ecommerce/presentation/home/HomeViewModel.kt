package com.akkayameva.ecommerce.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akkayameva.core.domain.model.Product
import com.akkayameva.core.domain.usecase.product.ProductUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class HomeViewModel(
    private val productUseCase: ProductUseCase,
) : ViewModel() {

    private val _listProductState: MutableStateFlow<List<Product>> = MutableStateFlow(listOf())
    val listProductState: StateFlow<List<Product>> = _listProductState

    fun getAllProducts() {
        productUseCase.getAllProducts().onEach { listProduct ->
            _listProductState.value = listProduct
        }.launchIn(viewModelScope)
    }
}