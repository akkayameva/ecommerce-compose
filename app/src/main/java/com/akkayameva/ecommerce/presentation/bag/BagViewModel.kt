package com.akkayameva.ecommerce.presentation.bag

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akkayameva.core.domain.model.Product
import com.akkayameva.core.domain.usecase.bag.BagUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class BagViewModel(
    val bagUseCase: BagUseCase
): ViewModel() {
    private val _listBagProductState: MutableStateFlow<List<Product>> = MutableStateFlow(listOf())
    val listBagProductState: StateFlow<List<Product>> = _listBagProductState

    init {
        getBagProduct()
    }

    private fun getBagProduct() {
        bagUseCase.getBagProduct().onEach { listProduct ->
            _listBagProductState.value = listProduct
        }.launchIn(viewModelScope)
    }

}