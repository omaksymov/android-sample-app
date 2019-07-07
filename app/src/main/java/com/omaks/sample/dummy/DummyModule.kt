package com.omaks.sample.dummy

import com.omaks.sample.ItemsRepository
import dagger.Module
import dagger.Provides

@Module
class DummyModule {
    @Provides
    fun provideRepository(): ItemsRepository = DummyRepository()
}