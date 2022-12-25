package com.example.udaapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.example.udaapp.databinding.ActivityMainBinding
import kotlin.random.Random
import kotlin.random.Random.Default.nextInt


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

//        chamando o button no binding e alterando o text
        val rollButton: Button =  binding.rollButton
        rollButton.text = "Jogar"
//        teste de OnClick para ver se o button foi realmente clicado
        rollButton.setOnClickListener {
//            Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
            rollDice()
        }

        diceImage = binding.diceImage
    }

    private fun rollDice() {

        val random: Int = nextInt(6) + 1

        val drawableResources = when (random) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResources)
//testando



    }
}











