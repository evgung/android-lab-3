package com.example.laba3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.laba3.databinding.ItemDayBinding

class ItemAdapter(private val items: List<Item>) :
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    class ViewHolder(val binding: ItemDayBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = ItemDayBinding.inflate(inflater, parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        val context = holder.itemView.context

        with (holder.binding) {
            tvId.text = String.format(context.getString(R.string.dayNumber), item.id)
            tvTitle.text = context.getString(item.titleId)
            tvDescription.text = context.getString(item.descriptionId)
            ivImage.setImageResource(item.imageId)
        }
    }
}