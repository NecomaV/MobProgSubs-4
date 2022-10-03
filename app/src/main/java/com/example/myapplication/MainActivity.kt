package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        //listener for the button when pushed
        rollButton.setOnClickListener{ rollDice() }
    }
    // rollDice function
    private fun rollDice() {
        var dice = Dice(6)
        var diceRoll = dice.roll()
        val diceImage: ImageView = findViewById(R.id.imageView)
        diceImage.setImageResource(R.drawable.dice_2)

    }
}
class Dice(val numSides : Int){
    //randomizer between 1 and sides that we give
    fun roll() : Int{
        return(1..numSides).random()
    }
}