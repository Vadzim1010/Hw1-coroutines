package com.example.hw1_coroutines.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.hw1_coroutines.database.dao.CatsDao
import com.example.hw1_coroutines.database.entity.CatEntity

@Database(entities = [CatEntity::class], version = 1)
abstract class CatsDatabase : RoomDatabase() {

    abstract fun getCatsDao(): CatsDao
}
