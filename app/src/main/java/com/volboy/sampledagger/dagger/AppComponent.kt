package com.volboy.sampledagger.dagger

import com.volboy.sampledagger.MainActivity
import dagger.Component

@Component(modules = [MainModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent
    }

    fun inject(mainActivity: MainActivity)
}