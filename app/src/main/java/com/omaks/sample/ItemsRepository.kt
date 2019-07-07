package com.omaks.sample

interface ItemsRepository {
    fun getAllItems(): List<Item>
    fun getItemsMap(): Map<String, Item>
}