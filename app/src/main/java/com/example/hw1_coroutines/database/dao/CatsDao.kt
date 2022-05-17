package com.example.hw1_coroutines.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.hw1_coroutines.database.entity.CatEntity

@Dao
interface CatsDao {

    @Query("SELECT * FROM CatEntity ORDER BY breed ASC LIMIT (:limit)")
    suspend fun getCats(limit: Int): List<CatEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCats(list: List<CatEntity>)
}
