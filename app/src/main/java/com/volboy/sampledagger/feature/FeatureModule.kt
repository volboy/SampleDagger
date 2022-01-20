package com.volboy.sampledagger.feature

import com.volboy.sampledagger.dagger.FeatureScope
import dagger.Module
import dagger.Provides

@Module
class FeatureModule {

    @Provides
    @FeatureScope
    fun provideSomeFeatureClass(): SomeFeatureClass =
        SomeFeatureClass()
}