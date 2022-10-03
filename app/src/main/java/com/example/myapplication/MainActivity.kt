package com.example.myapplication

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
        rollButton.setOnClickListener{
            rollDice()
        }
    }

    private fun rollDice() {
        var dice = Dice(6)
        var diceRoll = dice.roll()
        var resultTextView : TextView= findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
    }
}
class Dice(val numSides : Int){
    fun roll() : Int{
        return(1..numSides).random()
    }
}