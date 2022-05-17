package com.example.hw1_coroutines.retrofit.model

import com.example.hw1_coroutines.model.Cat
import com.google.gson.annotations.SerializedName

data class CatsBreedsResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val breed: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("image")
    val imageBreed: ImageBreed?,
) {


    fun toModel() = Cat(
        id = id,
        breed = breed,
        catImageUrl = imageBreed?.imageBreedUrl
    )
}

data class ImageBreed(
    @SerializedName("url")
    val imageBreedUrl: String
)
