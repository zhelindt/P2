package com.example.p2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        roll_button.setOnClickListener {
            rollDice()
        }
    }
    private fun rollDice() {
        //Toast.makeText(
        //   this, "button clicked",
        //    Toast.LENGTH_SHORT).show()

        val randomInt = Random().nextInt(6) + 1
        //val result_text: TextView = findViewById(R.id.result_text)
        val diceImage: ImageView = findViewById(R.id.dice_image)
        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        dice_image.setImageResource(drawableResource)

    }
}
