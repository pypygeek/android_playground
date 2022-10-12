package com.example.seoultour

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class PlaceActivity : AppCompatActivity(){
    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
        setContentView(R.layout.activity_place)
    }
}