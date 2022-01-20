package com.volboy.sampledagger

import android.util.Log
import javax.inject.Inject

interface Repository {
    fun getData()
}

class RepositoryImpl @Inject constructor(networkProvider: NetworkProvider) : Repository {
    override fun getData() {
        Log.i("TAG", "call get data")
    }
}