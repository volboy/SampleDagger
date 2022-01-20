package com.volboy.sampledagger.feature

import com.volboy.sampledagger.dagger.FeatureScope
import dagger.Subcomponent

@Subcomponent(modules = [FeatureModule::class])
@FeatureScope
interface FeatureComponent {

    fun provideSomeFeatureClass(): SomeFeatureClass

    @Subcomponent.Builder
    interface Builder {
        fun build(): FeatureComponent
    }
}