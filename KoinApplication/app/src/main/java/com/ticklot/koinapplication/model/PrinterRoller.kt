package com.ticklot.koinapplication.model



class PrinterRoller(private val paperBundle: PaperBundle): Roller {

    override fun rollPaper() {
        if (paperBundle.canRollPaper()) {
            println("oooooo rolling oooooo")
            paperBundle.setPaperRolled()
        }
    }

}