package com.volboy.sampledagger.dagger

import com.volboy.sampledagger.NetworkProvider
import com.volboy.sampledagger.Repository
import dagger.Module
import dagger.Provides

@Module
class MainModule {

    @Provides
    fun provideRepository(networkProvider: NetworkProvider): Repository =
        Repository(networkProvider)

    @Provides
    fun provideNetworkProvider(): NetworkProvider =
        NetworkProvider()
}