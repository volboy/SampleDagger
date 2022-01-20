package com.volboy.sampledagger.dagger

import android.content.Context
import com.volboy.sampledagger.MainActivity
import dagger.BindsInstance
import dagger.Component

@Component(modules = [MainModule::class])
interface AppComponent {

    @Component.Builder
    interface Builder {
        fun build(): AppComponent

        @BindsInstance
        fun context(context: Context): Builder
    }

    fun inject(mainActivity: MainActivity)
}