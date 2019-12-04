package com.ticklot.koinapplication

import com.ticklot.koinapplication.di.printerModule
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.test.check.checkModules

class PrinterModuleTest {

    @Test
    fun `check all definitions of printer module`() {

        startKoin {
            modules(printerModule)
        }.checkModules()

    }

}