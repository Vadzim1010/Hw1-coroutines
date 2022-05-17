package com.example.hw1_coroutines

import android.app.Application
import androidx.room.Room
import com.example.hw1_coroutines.database.CatsDatabase
import com.example.hw1_coroutines.repository.CatsRepository
import com.example.hw1_coroutines.retrofit.CatsServiceLocator


class CatsApplication : Application() {


    private val catsApi by lazy { CatsServiceLocator.provideCatsApi() }

    private var _appDatabase: CatsDatabase? = null
    private val appDatabase get() = requireNotNull(_appDatabase)

    val catsRepository by lazy { CatsRepository(catsApi, appDatabase.getCatsDao()) }


    override fun onCreate() {
        super.onCreate()
        _appDatabase = Room
            .databaseBuilder(
                this,
                CatsDatabase::class.java,
                "room_database"
            )
            .build()
    }
}
