package com.akkayameva.ecommerce.presentation.detail

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.akkayameva.core.domain.model.Product
import com.akkayameva.core.domain.usecase.detail.DetailUseCase
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach

class DetailViewModel(
    private val detailUseCase: DetailUseCase
): ViewModel() {

    private val _isProductOnBagState: MutableStateFlow<Boolean> = MutableStateFlow(false)
    val isProductOnBagState: StateFlow<Boolean> = _isProductOnBagState

    fun addToBagProduct(product: Product){
        detailUseCase.addToBagProduct(product)
    }
    fun removeFromBagProduct(product: Product){
        detailUseCase.removeFromBagProduct(product)
    }
    fun isProductOnBag(id: Int){
        detailUseCase.isProductOnBag(id).onEach { isProductOnBag ->
            _isProductOnBagState.value = isProductOnBag
        }.launchIn(viewModelScope)
    }
}