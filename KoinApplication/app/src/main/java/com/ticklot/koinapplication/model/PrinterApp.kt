package com.ticklot.koinapplication.model

import org.koin.core.KoinComponent
import org.koin.core.inject

class PrinterApp: KoinComponent {

    private val printer: Printer by inject()

    fun startPrinting() {
        printer.print()
    }


}