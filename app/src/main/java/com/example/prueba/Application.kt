package com.example.prueba

import android.app.Application
import com.example.prueba.di.koin.DataModule
import com.example.prueba.di.koin.DomainModule
import com.example.prueba.di.koin.PresentationModule

import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class Application : Application() {
    override fun onCreate(){
        super.onCreate()

        startKoin{
            androidLogger(
                if (BuildConfig.DEBUG) {
                    Level.INFO
                } else {
                    Level.NONE
                }
            )
            androidContext(this@Application)
            modules(DataModule, DomainModule, PresentationModule)
        }
    }
}