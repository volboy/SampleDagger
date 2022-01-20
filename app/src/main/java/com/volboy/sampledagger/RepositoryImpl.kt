package com.volboy.sampledagger

import android.util.Log

interface Repository {
    fun getData()
}

class RepositoryImpl(networkProvider: NetworkProvider) : Repository {
    override fun getData() {
        Log.i("TAG", "call get data")
    }
}