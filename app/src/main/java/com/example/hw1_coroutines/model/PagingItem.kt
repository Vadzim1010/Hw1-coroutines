package com.example.hw1_coroutines.model

sealed class PagingItem<out T> {

    data class Content<T>(val data: T) : PagingItem<T>()

    data class Error(val error: Throwable) : PagingItem<Nothing>()

    object Loading : PagingItem<Nothing>()
}
