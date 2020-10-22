package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
//        val firstDice = Dice(6)
//        val secondDice = Dice(6)
//        val firstDiceRoll = firstDice.roll()
//        val secondDiceRoll = secondDice.roll()
        val resultFirstTextView: TextView = findViewById(R.id.textView)
//        val resultSecondTextView: TextView = findViewById(R.id.textView2)
//        resultFirstTextView.text = firstDiceRoll.toString()
//        resultSecondTextView.text = secondDiceRoll.toString()
        resultFirstTextView.text = "Ты пидор!!!!Щутка Азазаза"
    }

    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }
}