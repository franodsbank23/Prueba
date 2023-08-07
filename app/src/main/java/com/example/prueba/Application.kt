package com.example.prueba

import com.example.prueba.di.koin.appModule
import org.koin.core.context.startKoin

class Application : Application() {
    override fun onCreate(){
        super.onCreate()

        startKoin{
            androidLogger()
            androidContext(this@Application)
            modules(appModule)
        }
    }
}