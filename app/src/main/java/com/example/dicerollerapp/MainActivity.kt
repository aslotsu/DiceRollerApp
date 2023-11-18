package com.example.dicerollerapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView


class MainActivity : AppCompatActivity() {
    private lateinit var diceImageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton = findViewById<Button>(R.id.button)

        rollButton.setOnClickListener {
            rollDice()
        }
        diceImageView = findViewById(R.id.imageView)
    }

    private fun rollDice() {
        val dice = (1..6).random()
        val diceImageView = findViewById<ImageView>(R.id.imageView)
        val image = when(dice){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
             else -> R.drawable.dice_6
        }
        diceImageView.setImageResource(image)
    }
}