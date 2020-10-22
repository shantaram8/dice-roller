package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { rollDice() }
    }

    private fun rollDice() {
        val resultTextView: TextView = findViewById(R.id.textView)
        val luckyNumberTextView: TextView = findViewById(R.id.luckyNumber)
        val rolledNumberTextView: TextView = findViewById(R.id.rolledNumber)
        val firstDice = Dice(6)
        val diceRoll = firstDice.roll()
        rolledNumberTextView.text =  "Your rolled: $diceRoll"

        val luckyNumber: Number = 5

        luckyNumberTextView.text = "Your lucky number: $luckyNumber"

        when(diceRoll) {
            luckyNumber -> {
                resultTextView.text = "You won!!!"
            }

            1-> resultTextView.text = "You defeat!!! You rolled 1"
            2-> resultTextView.text = "You defeat!!! You rolled 2"
            3-> resultTextView.text = "You defeat!!! You rolled 3"
            4-> resultTextView.text = "You defeat!!! You rolled 4"
            5-> resultTextView.text = "You defeat!!! You rolled 5"
            6-> resultTextView.text = "You defeat!!! You rolled 6"
        }
//        resultFirstTextView.text = diceRoll.toString()
    }

    class Dice(private val numSides: Int) {
        fun roll(): Int {
            return (1..numSides).random()
        }
    }


}