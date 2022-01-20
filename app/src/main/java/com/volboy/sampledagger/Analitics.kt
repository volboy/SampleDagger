package com.volboy.sampledagger

import android.util.Log
import javax.inject.Inject

interface Analytics {
    fun getAnalytics()
}

class AnalyticsImpl @Inject constructor() : Analytics {
    override fun getAnalytics() {
        Log.i("TAG", "call getAnalytics")
    }
}