package com.volboy.sampledagger

import android.util.Log
import com.volboy.sampledagger.dagger.Prod
import javax.inject.Inject

interface Repository {
    fun getData()
}

class RepositoryImpl @Inject constructor(
    @Prod
    private val networkProvider: NetworkProvider) : Repository {
    override fun getData() {
        Log.i("TAG", "call get data")
    }
}