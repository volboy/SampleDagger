package com.volboy.sampledagger

import android.util.Log
import javax.inject.Inject
import javax.inject.Named

interface Repository {
    fun getData()
}

class RepositoryImpl @Inject constructor(
    @param:Named("prod")
    private val networkProvider: NetworkProvider) : Repository {
    override fun getData() {
        Log.i("TAG", "call get data")
    }
}