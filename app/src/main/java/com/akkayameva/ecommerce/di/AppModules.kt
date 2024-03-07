package com.akkayameva.ecommerce.di


import com.akkayameva.ecommerce.presentation.home.HomeViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val useCaseModule = module {

}

val viewModelModule = module {

}

val listModules = listOf(
    useCaseModule,
    viewModelModule
)