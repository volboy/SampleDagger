package com.volboy.sampledagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var repositoryImpl: Repository

    @Inject
    lateinit var analyticsImpl: Analytics

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appComponent.inject(this)
        val app = App()
        app.appComponent
        repositoryImpl.getData()
        trackOnStart(analyticsImpl)
    }

    private fun trackOnStart(analytics: Analytics) {
        analytics.getAnalytics()
    }
}