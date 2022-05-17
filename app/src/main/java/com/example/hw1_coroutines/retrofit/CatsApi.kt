package com.example.hw1_coroutines.retrofit

import com.example.hw1_coroutines.retrofit.model.CatsBreedsResponse
import com.example.hw1_coroutines.retrofit.model.DescriptionResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CatsApi {

    @GET("breeds")
    suspend fun getCatsBreed(
        @Query("page") page: Int,
        @Query("limit") limit: Int,
    ): List<CatsBreedsResponse>

    @GET("images/search")
    suspend fun getBreedById(
        @Query("breed_ids") breedId: String
    ): List<DescriptionResponse>
}
