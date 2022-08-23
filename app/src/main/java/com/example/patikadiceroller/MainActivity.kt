package com.example.patikadiceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    private lateinit var button: Button
    private lateinit var imageFirst: ImageView
    private lateinit var imageSecond: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button = findViewById(R.id.button)

        button.setOnClickListener {
            val random_first = Random.nextInt(6)+1
            val random_second = Random.nextInt(6)+1
            imageFirst = findViewById(R.id.image_first)
            imageSecond = findViewById(R.id.image_second)

            val resource_first = when(random_first){
                1 -> R.drawable.ic_one
                2 -> R.drawable.ic_two
                3 -> R.drawable.ic_three
                4 -> R.drawable.ic_four
                5 -> R.drawable.ic_five
                else -> R.drawable.ic_six
            }

            val resource_second = when(random_second){
                1 -> R.drawable.ic_one
                2 -> R.drawable.ic_two
                3 -> R.drawable.ic_three
                4 -> R.drawable.ic_four
                5 -> R.drawable.ic_five
                else -> R.drawable.ic_six
            }

            imageFirst.setImageResource(resource_first)
            imageSecond.setImageResource(resource_second)
        }
    }
}