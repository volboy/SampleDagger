package com.volboy.sampledagger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var repositoryImpl: Repository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        appComponent.inject(this)
        val app = App()
        app.appComponent
        repositoryImpl.getData()
    }

     /**аннотация inject на методе приведет к тому
     что метод вызовется в момент инжекта зависимостей
     в класс mainActivity, все завимисимости в методе
     разрезолвит даггер*/
    @Inject
    fun trackOnStart(analytics: Analytics) {
        analytics.getAnalytics()
    }
}