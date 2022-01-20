package com.volboy.sampledagger.dagger

import com.volboy.sampledagger.NetworkProvider
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {
    @Provides
    fun provideNetworkProvider(): NetworkProvider =
        NetworkProvider()
}