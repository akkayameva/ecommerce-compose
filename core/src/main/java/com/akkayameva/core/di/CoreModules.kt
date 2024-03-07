package com.akkayameva.core.di

import android.util.Log
import androidx.room.Room
import com.akkayameva.core.data.repository.bag.BagRepositoryImpl
import com.akkayameva.core.data.repository.detail.DetailRepositoryImpl
import com.akkayameva.core.data.repository.product.ProductRepositoryImpl
import com.akkayameva.core.data.source.local.LocalDataSource

import com.akkayameva.core.data.source.local.room.database.ProductDataBase
import com.akkayameva.core.data.source.remote.RemoteDataSource
import com.akkayameva.core.data.source.remote.api.LocalProductApiImpl
import com.akkayameva.core.data.source.remote.api.ProductApi
import com.akkayameva.core.domain.repository.bag.BagRepository
import com.akkayameva.core.domain.repository.detail.DetailRepository
import com.akkayameva.core.domain.repository.product.ProductRepository
import io.ktor.client.HttpClient
import org.koin.dsl.module
import io.ktor.client.engine.android.Android
import io.ktor.client.features.HttpTimeout
import io.ktor.client.features.json.JsonFeature
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.features.logging.LogLevel
import io.ktor.client.features.logging.Logger
import io.ktor.client.features.logging.Logging
import kotlinx.serialization.json.Json
import org.koin.android.ext.koin.androidContext


val networkModule = module {
    single {
        HttpClient(Android) {
            install(HttpTimeout) {
                requestTimeoutMillis = 15000L
                connectTimeoutMillis = 15000L
                socketTimeoutMillis = 15000L
            }

            install(JsonFeature) {
                serializer = KotlinxSerializer(Json {
                    prettyPrint = true
                    isLenient = true
                    ignoreUnknownKeys = true
                })
            }

            install(Logging) {

                level = LogLevel.ALL
                logger = object : Logger {
                    override fun log(message: String) {
                        Log.i("KTOR_LOGGER", message)
                    }

                }
            }
        }
    }
    single<ProductApi> {
        LocalProductApiImpl()
    }
}

val databaseModule = module {
    factory { get<ProductDataBase>().productDao() }
    single {
        Room.databaseBuilder(
            androidContext(),
            ProductDataBase::class.java, "product.database"
        ).fallbackToDestructiveMigration()
            .build()
    }
}

val dataSourceModule = module {
    factory { RemoteDataSource(get()) }
    factory { LocalDataSource(get()) }
}

val repositoryModule = module {
    single<DetailRepository> { DetailRepositoryImpl(get()) }
    single<BagRepository> { BagRepositoryImpl(get()) }
    single<ProductRepository> { ProductRepositoryImpl(get()) }
}