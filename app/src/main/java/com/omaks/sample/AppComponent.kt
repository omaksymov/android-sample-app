package com.omaks.sample

import com.omaks.sample.dummy.DummyModule
import dagger.Component

@Component(modules = [DummyModule::class])
interface AppComponent {
    fun inject(activity: ItemListActivity)
    fun inject(detailsFragment: ItemDetailFragment)
}