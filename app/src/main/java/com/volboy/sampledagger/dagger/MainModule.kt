package com.volboy.sampledagger.dagger

import com.volboy.sampledagger.NetworkProvider
import com.volboy.sampledagger.Repository
import dagger.Module
import dagger.Provides

@Module(includes = [NetworkModule::class])
class MainModule {

    @Provides
    fun provideRepository(networkProvider: NetworkProvider): Repository =
        Repository(networkProvider)
}