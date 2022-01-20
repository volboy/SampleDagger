package com.volboy.sampledagger.dagger

import com.volboy.sampledagger.NetworkProvider
import dagger.Module
import dagger.Provides
import javax.inject.Named

@Module
class NetworkModule {

    @Provides
    @Named("prod")
    fun provideNetworkProviderProd(): NetworkProvider {
        return NetworkProvider("www.prod.ru")
    }

    @Provides
    @Named("stage")
    fun provideNetworkProviderStage(): NetworkProvider {
        return NetworkProvider("www.stage.ru")
    }
}