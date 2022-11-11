package com.example.cultureapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movieButtonClicked = findViewById<ImageButton>(R.id.movieButton)
        movieButtonClicked.setOnClickListener{
            val intent = Intent(this, MovieActivity::class.java)
            startActivity(intent)
        }

        val BookButtonClicked = findViewById<ImageButton>(R.id.bookButton)
        BookButtonClicked.setOnClickListener{
            val intent = Intent(this, BookActivity::class.java)
            startActivity(intent)
        }

        val performanceButtonClicked = findViewById<ImageButton>(R.id.performanceButton)
        performanceButtonClicked.setOnClickListener{
            val intent = Intent(this, PerformanceActivity::class.java)
            startActivity(intent)
        }
    }
}