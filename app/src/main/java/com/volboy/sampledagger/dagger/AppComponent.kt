package com.volboy.sampledagger.dagger

import com.volboy.sampledagger.MainActivity
import com.volboy.sampledagger.feature.FeatureComponent
import dagger.Component

@Component(modules = [MainModule::class], dependencies = [AppDependencies::class])
@AppScope
interface AppComponent {

    fun featureComponent(): FeatureComponent.Builder

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
        fun appDependencies(appDependencies: AppDependencies): Builder
    }

    fun inject(mainActivity: MainActivity)
}