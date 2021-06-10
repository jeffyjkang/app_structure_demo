package com.example.appstructuredemo.application

import android.app.Application
import com.example.appstructuredemo.model.Order

class StructureApplication: Application() {

    val order = Order()

    override fun onCreate() {
        super.onCreate()
    }
}