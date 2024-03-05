package com.akkayameva.core.data.repository.detail

import com.akkayameva.core.data.source.local.LocalDataSource
import com.akkayameva.core.data.source.remote.RemoteDataSource
import com.akkayameva.core.domain.repository.detail.DetailRepository


class DetailRepositoryImpl(
    val remoteDataSource: RemoteDataSource,
    val localDataSource: LocalDataSource
): DetailRepository {
}