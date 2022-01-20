package com.volboy.sampledagger.dagger

import com.volboy.sampledagger.NetworkProvider
import dagger.Module
import dagger.Provides

@Module
class NetworkModule {

    @Provides
    @Prod
    @AppScope
    fun provideNetworkProviderProd(): NetworkProvider {
        return NetworkProvider("www.prod.ru")
    }

    @Provides
    @Stage
    @AppScope
    fun provideNetworkProviderStage(): NetworkProvider {
        return NetworkProvider("www.stage.ru")
    }
}