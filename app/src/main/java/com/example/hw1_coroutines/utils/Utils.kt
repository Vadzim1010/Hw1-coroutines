package com.example.hw_catsapi.utils

import android.util.Log
import com.example.hw1_coroutines.model.Cat
import com.example.hw1_coroutines.model.CatDescription
import com.example.hw1_coroutines.model.PagingItem
import com.example.hw1_coroutines.retrofit.model.CatsBreedsResponse
import com.example.hw1_coroutines.retrofit.model.DescriptionResponse
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map


fun List<CatsBreedsResponse>.mapToCats(): List<Cat> {
    return this.map { apiCatsBreed ->
        apiCatsBreed.toModel()
    }
}

fun Flow<List<Cat>>.mapToPage(): Flow<List<PagingItem<Cat>>> {
    return this.map { catBreedList ->
        catBreedList.map { catBreed ->
            catBreed.toPagingItem()
        }
    }
}

fun List<DescriptionResponse>.mapToDescription(): List<CatDescription> {
    return this.map { catDescription ->
        catDescription.toModel()
    }
}

fun log(message: String) {
    Log.i("TAG", message)
}