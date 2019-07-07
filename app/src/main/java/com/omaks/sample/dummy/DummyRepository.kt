package com.omaks.sample.dummy

import com.omaks.sample.Item
import com.omaks.sample.ItemsRepository

class DummyRepository : ItemsRepository {
    override fun getAllItems(): List<Item> = DummyContent.ITEMS

    override fun getItemsMap(): Map<String, Item> = DummyContent.ITEM_MAP
}