package com.ticklot.daggerapplication

import android.app.Application
import com.ticklot.koinapplication.model.Printer
import com.ticklot.koinapplication.di.printerModule
import org.koin.android.ext.android.get
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin

class ApplicationClass: Application() {


    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger()
            androidContext(this@ApplicationClass)
            modules(listOf(printerModule))
        }

        get<Printer>().print()

    }


}