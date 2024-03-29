package com.volboy.sampledagger.dagger

import com.volboy.sampledagger.Repository
import dagger.Component

@Component(modules = [MainModule::class])
interface AppComponent {
    fun provideRepository(): Repository
}