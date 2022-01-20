package com.volboy.sampledagger.dagger

import javax.inject.Qualifier

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Prod

@Qualifier
@Retention(AnnotationRetention.RUNTIME)
annotation class Stage