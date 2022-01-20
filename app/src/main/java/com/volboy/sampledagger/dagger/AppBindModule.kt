package com.volboy.sampledagger.dagger

import com.volboy.sampledagger.Analytics
import com.volboy.sampledagger.AnalyticsImpl
import com.volboy.sampledagger.Repository
import com.volboy.sampledagger.RepositoryImpl
import dagger.Binds
import dagger.Module

@Module
interface AppBindModule {

    @Binds
    fun bindRepository(repositoryImpl: RepositoryImpl): Repository

    @Binds
    fun bindAnalytics(analyticsImpl: AnalyticsImpl): Analytics
}