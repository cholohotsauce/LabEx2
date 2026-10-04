package com.arcadiovega.lab2

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var textOutput: TextView

    private var counter = 0
    private var step = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textOutput = findViewById(R.id.textOutput)

        val buttonAdd: Button = findViewById(R.id.buttonAdd)
        val buttonSubtract: Button = findViewById(R.id.buttonSubtract)
        val buttonReset: Button = findViewById(R.id.buttonReset)
        val buttonStep: Button = findViewById(R.id.buttonStep)

        buttonAdd.setOnClickListener {
            counter += step
            textOutput.text = counter.toString()
        }

        buttonSubtract.setOnClickListener {
            counter -= step
            textOutput.text = counter.toString()
        }

        buttonReset.setOnClickListener {
            counter = 0
            step = 1
            textOutput.text = counter.toString()
            buttonStep.text = "Step"
        }

        buttonStep.setOnClickListener {
            step = 2
            buttonStep.text = "Step: 2"
        }
    }
}