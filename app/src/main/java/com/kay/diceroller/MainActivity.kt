package com.kay.diceroller

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {
    private lateinit var diceImage: ImageView
    private lateinit var rollButton: Button
    private lateinit var diceValueText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        rollButton = findViewById(R.id.roll_button)
        diceValueText = findViewById(R.id.dice_value_text)
        rollButton.setOnClickListener { rollDice() }
        rollDice()
    }
    private fun rollDice() {
        val randomInt = Random().nextInt(6) + 1
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        diceImage.setImageResource(drawableResource)

        diceImage.contentDescription = getString(
            when (randomInt) {
                1 -> R.string.dice_1
                2 -> R.string.dice_2
                3 -> R.string.dice_3
                4 -> R.string.dice_4
                5 -> R.string.dice_5
                else -> R.string.dice_6
            }
        )
        diceValueText.text = getString(R.string.rolled_value, randomInt)
    }
}