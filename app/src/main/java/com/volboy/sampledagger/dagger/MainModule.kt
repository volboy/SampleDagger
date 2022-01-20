package com.volboy.sampledagger.dagger

import dagger.Module

@Module(includes = [NetworkModule::class, AppBindModule::class])
class MainModule