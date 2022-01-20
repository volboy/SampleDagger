package com.volboy.sampledagger

import android.util.Log

class Repository(networkProvider: NetworkProvider) {
    fun getData(){
        Log.i("TAG", "call get data")
    }
}