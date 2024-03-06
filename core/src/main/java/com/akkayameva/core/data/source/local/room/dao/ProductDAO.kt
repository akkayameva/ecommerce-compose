package com.akkayameva.core.data.source.local.room.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.akkayameva.core.data.source.local.room.entity.ProductEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface ProductDAO {
    @Query("SELECT * FROM ProductEntity")
    fun getBagProductList(): Flow<List<ProductEntity>>
    @Query("SELECT * FROM ProductEntity WHERE id LIKE :id")
    fun getBagProductById(id: Int): Flow<ProductEntity?>
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBagProduct(productEntity: ProductEntity)
    @Delete
    suspend fun deleteBagProduct(productEntity: ProductEntity)

}