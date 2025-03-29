package com.example.laba3

import android.content.Context

class Data {
    companion object {
        fun createItems(context: Context): List<Item> {
            val items = mutableListOf<Item>()
            val resources = context.resources

            for (i in 1..30) {
                val titleId = resources.getIdentifier(
                    "item${i}_title",
                    "string",
                    context.packageName
                )

                val descId = resources.getIdentifier(
                    "item${i}_desc",
                    "string",
                    context.packageName
                )

                val imageId = resources.getIdentifier(
                    "item${i}_image",
                    "drawable",
                    context.packageName
                )

                items.add(Item(
                    i,
                    titleId,
                    descId,
                    imageId
                ))
            }

            return items
        }
    }
}