package com.volboy.sampledagger

import android.app.Application
import android.content.Context
import com.volboy.sampledagger.dagger.AppComponent
import com.volboy.sampledagger.dagger.AppDependencies
import com.volboy.sampledagger.dagger.DaggerAppComponent

class App : Application() {

    internal var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent
            .builder()
            .appDependencies(AppDependenciesImpl(this))
            .build()
    }

    inner class AppDependenciesImpl(
        override val context: Context
    ) : AppDependencies {

    }
}

//extension для получения appComponent
val Context.appComponent: AppComponent
    get() = when (this) {
        is App -> checkNotNull(appComponent) {
            "AppComponent isn't initialized"
        }
        else -> checkNotNull(applicationContext.appComponent) {
            "AppComponent isn't initialized"
        }
    }