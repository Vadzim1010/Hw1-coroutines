package com.example.hw1_coroutines.adapter.holder


import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import coil.size.ViewSizeResolver
import com.example.hw1_coroutines.databinding.ItemCatBinding
import com.example.hw1_coroutines.model.Cat
import com.example.hw1_coroutines.model.PagingItem


class CatViewHolder(
    private val binding: ItemCatBinding,
    private val itemClick: (String) -> Unit
) : RecyclerView.ViewHolder(binding.root) {


    fun bind(itemCat: PagingItem.Content<Cat>) {
        with(binding) {
            catBreedTextView.text = itemCat.data.breed
            catImageView.load(itemCat.data.catImageUrl) {
                scale(Scale.FILL)
                size(ViewSizeResolver(root))
            }
            cardView.setOnClickListener {
                itemClick(itemCat.data.id)
            }
        }
    }
}
