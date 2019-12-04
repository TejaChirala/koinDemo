package com.ticklot.koinapplication.model


class Printer(_paperBundle: Lazy<PaperBundle>, private val roller: Roller) {

    private val paperBundle by _paperBundle

    fun print() {

        paperBundle.getPaper()
        println("Printing.....")
        roller.rollPaper()

    }

}