package com.example.hw1_coroutines.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object CatsServiceLocator {


    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.thecatapi.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    private val catsApi by lazy {
        retrofit.create<CatsApi>()
    }

    fun provideCatsApi(): CatsApi {
        return catsApi
    }
}
