package com.akkayameva.ecommerce.di

import com.akkayameva.core.domain.usecase.bag.BagInteractor
import com.akkayameva.core.domain.usecase.bag.BagUseCase
import com.akkayameva.core.domain.usecase.detail.DetailInteractor
import com.akkayameva.core.domain.usecase.detail.DetailUseCase
import com.akkayameva.core.domain.usecase.product.ProductInteractor
import com.akkayameva.core.domain.usecase.product.ProductUseCase
import com.akkayameva.ecommerce.presentation.bag.BagViewModel
import com.akkayameva.ecommerce.presentation.detail.DetailViewModel
import com.akkayameva.ecommerce.presentation.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {
    single<DetailUseCase> { DetailInteractor(get()) }
    single<BagUseCase> { BagInteractor(get()) }
    single<ProductUseCase> { ProductInteractor(get()) }
}

val viewModelModule = module {
    viewModel { HomeViewModel(get()) }
    viewModel { DetailViewModel(get()) }
    viewModel { BagViewModel(get()) }
}

val listModules = listOf(
    useCaseModule,
    viewModelModule
)