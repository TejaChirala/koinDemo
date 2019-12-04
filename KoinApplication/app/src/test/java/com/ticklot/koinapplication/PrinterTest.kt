package com.ticklot.koinapplication

import com.ticklot.koinapplication.model.PaperBundle
import com.ticklot.koinapplication.model.Printer
import com.ticklot.koinapplication.di.printerModule
import org.junit.Test
import org.koin.core.context.startKoin
import org.koin.test.KoinTest
import org.koin.test.inject
import org.koin.test.mock.declareMock
import org.mockito.BDDMockito.*

class PrinterTest: KoinTest {

    private val printer: Printer by inject()
    private val paperBundle: PaperBundle by inject()

    @Test
    fun `check roll paper status before and after print`() {

        startKoin { modules(printerModule) }

        declareMock<PaperBundle>()

        given(paperBundle.canRollPaper()).will { true }
        printer.print()

        verify(paperBundle, times(1)).canRollPaper()
        verify(paperBundle, times(1)).setPaperRolled()


    }

}