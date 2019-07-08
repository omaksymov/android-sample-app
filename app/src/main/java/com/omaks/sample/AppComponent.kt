package com.omaks.sample

import dagger.Component

@Component
interface AppComponent {
    fun inject(activity: ItemListActivity)
    fun inject(detailsFragment: ItemDetailFragment)
}