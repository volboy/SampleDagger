package com.volboy.sampledagger.dagger

import android.content.Context
import com.volboy.sampledagger.ResourceManager
import dagger.Module
import dagger.Provides
import dagger.Reusable

@Module(includes = [NetworkModule::class, AppBindModule::class])
class MainModule {

    @Provides
    @Reusable
    fun providesResourceManager(context: Context): ResourceManager =
        ResourceManager(context)

}