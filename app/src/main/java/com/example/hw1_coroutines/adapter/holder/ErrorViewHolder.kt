package com.example.hw1_coroutines.adapter.holder

import androidx.recyclerview.widget.RecyclerView
import com.example.hw1_coroutines.databinding.ItemErrorBinding
import com.example.hw1_coroutines.model.PagingItem


class ErrorViewHolder(
    private val binding: ItemErrorBinding
) : RecyclerView.ViewHolder(binding.root) {


    fun bind(errorItem: PagingItem.Error) {
        binding.errorTextView.text = errorItem.error.message
    }
}
