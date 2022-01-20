package com.volboy.sampledagger.feature.di

import com.volboy.sampledagger.dagger.AppComponent
import com.volboy.sampledagger.dagger.FeatureScope
import com.volboy.sampledagger.feature.SomeFeatureClass
import dagger.Component

@Component(modules = [FeatureModule::class], dependencies = [AppComponent::class])
@FeatureScope
interface FeatureComponent {

    fun provideSomeFeatureClass(): SomeFeatureClass

    @Component.Builder
    interface Builder {
        fun appComponent(appComponent: AppComponent): Builder
        fun build(): FeatureComponent
    }
}