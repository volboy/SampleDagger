package com.volboy.sampledagger.feature.di

import com.volboy.sampledagger.dagger.FeatureScope
import com.volboy.sampledagger.feature.SomeFeatureClass
import dagger.Module
import dagger.Provides

@Module
class FeatureModule {

    @Provides
    @FeatureScope
    fun provideSomeFeatureClass(): SomeFeatureClass =
        SomeFeatureClass()
}