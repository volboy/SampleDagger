package com.volboy.sampledagger.dagger

import com.volboy.sampledagger.NetworkProvider
import com.volboy.sampledagger.RepositoryImpl
import dagger.Module
import dagger.Provides

@Module(includes = [NetworkModule::class, AppBindModule::class])
class MainModule {

    @Provides
    fun provideRepositoryImpl(networkProvider: NetworkProvider): RepositoryImpl =
        RepositoryImpl(networkProvider)
}