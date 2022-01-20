package com.volboy.sampledagger

import android.app.Application
import android.content.Context
import com.volboy.sampledagger.dagger.AppComponent
import com.volboy.sampledagger.dagger.DaggerAppComponent

class App : Application() {

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.create()
    }
}

//extension для получения appComponent
val Context.appComponent: AppComponent
    get() = when (this) {
        is App -> appComponent
        else -> applicationContext.appComponent
    }