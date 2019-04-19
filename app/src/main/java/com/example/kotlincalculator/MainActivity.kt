package com.example.kotlincalculator

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.nio.file.attribute.AclFileAttributeView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @Suppress("IMPLICIT_CAST_TO_ANY")
    @SuppressLint("SetTextI18n")
    fun calculate(view: View){

        val result = findViewById<TextView>(R.id.resultText)
        val selectedRadioButton = findViewById<RadioButton>(radioGroup.checkedRadioButtonId)

        val firstNumber : Float = getFirstNumber()
        val secondNumber : Float = getSecondNumber()

        result.text = "Result: " + when(selectedRadioButton.text){
            "+" -> firstNumber + secondNumber
            "-" -> firstNumber - secondNumber
            "x" -> firstNumber * secondNumber
            "/" -> firstNumber / secondNumber
            else -> 0
        }.toString()

    }

    private fun getFirstNumber(): Float{
        val firstNumber = findViewById<EditText>(R.id.firstNumber)
        return firstNumber.text.toString().toFloat()
    }

    private fun getSecondNumber(): Float{
        val secondNumber = findViewById<EditText>(R.id.secondNumber)
        return secondNumber.text.toString().toFloat()
    }
}
