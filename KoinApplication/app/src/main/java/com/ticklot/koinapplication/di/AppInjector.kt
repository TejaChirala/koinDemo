package com.ticklot.koinapplication.di

import com.ticklot.koinapplication.model.*
import org.koin.dsl.module

val printerModule = module {

    single {
        Printer(
            lazy { get<PaperBundle>() },
            get()
        )
    }
    single<Roller>{
        PrinterRoller(
            get<PaperBundle>()
        )
    }
    single<PaperBundle> { PaperTray() }

}