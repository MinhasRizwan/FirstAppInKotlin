package com.example.firstappinkotlin_30_7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random
import kotlin.random.Random as Random1
import kotlin.random.Random as Random2
import kotlin.random.Random as Random3

class SecondActivity : AppCompatActivity() {

    companion object{
        const val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        showRandomNumber()
    }

    fun showRandomNumber()
    {
        // Get the count from the intent extras
        val count = intent.getIntExtra(TOTAL_COUNT, 0)

        // Generate the random number
        val random = Random
        var randomInt = 0

        // Add one because the bound is exclusive
        if (count>0)
        {
            // Add one because the bound is exclusive
            randomInt = random.nextInt(count + 1)
        }

        // Display the random number.
        findViewById<TextView>(R.id.textView_random).text = Integer.toString(randomInt)

        // Substitute the max value into the string resource
        // for the heading, and update the heading
        findViewById<TextView>(R.id.textView_label).text = getString(R.string.random_heading, count)

    }



}
