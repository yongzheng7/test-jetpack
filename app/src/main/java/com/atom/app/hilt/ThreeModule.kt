package com.atom.app.hilt

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent

@Module
@InstallIn(ActivityComponent::class)
class ThreeModule {

    @Provides
    fun providerThreeAdapter() : ThreeAdapter = ThreeAdapter("ThreeModule Provider")

}