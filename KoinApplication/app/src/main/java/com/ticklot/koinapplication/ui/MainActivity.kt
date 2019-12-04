package com.ticklot.koinapplication.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ticklot.koinapplication.R
import com.ticklot.koinapplication.model.Printer

import org.koin.android.ext.android.get

class MainActivity : AppCompatActivity() {

    private val printer: Printer = get()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Printing
        printer.print()

    }

}
