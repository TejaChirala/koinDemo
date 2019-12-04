package com.ticklot.koinapplication.model


class PaperTray: PaperBundle {

    private var paperCount = 10
    private var canRollPaper = false

    override fun getPaper() {
        if (paperCount > 0) {
            println("Getting paper")
            paperCount--
            canRollPaper = true
        }

    }

    override fun setPaperRolled() {
        canRollPaper = false
    }

    override fun canRollPaper() : Boolean{
        return canRollPaper
    }


}