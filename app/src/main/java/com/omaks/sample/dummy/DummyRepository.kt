package com.omaks.sample.dummy

import com.omaks.sample.Item
import com.omaks.sample.ItemsRepository
import dagger.Reusable
import javax.inject.Inject

@Reusable
class DummyRepository @Inject constructor() : ItemsRepository {
    override fun getAllItems(): List<Item> = DummyContent.ITEMS

    override fun getItemsMap(): Map<String, Item> = DummyContent.ITEM_MAP
}