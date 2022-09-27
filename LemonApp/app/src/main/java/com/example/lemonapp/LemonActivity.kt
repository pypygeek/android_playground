package com.example.lemonapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar

class LemonActivity : AppCompatActivity() {
    // Class's member variables declaration
    var imglemon: ImageView? = null   // 미리 선언해 둠
    var lemonState = "select"
    var lemonSize = -1
    var squeezeCount = -1
    // 액티비티 화면 생성될 때 실행되는 메소드
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lemon_main)
        imglemon = findViewById(R.id.image_lemon)
        imglemon?.setOnClickListener { clickLemonImage() }
        imglemon?.setOnLongClickListener { showSnackbar() }
    }

    private fun clickLemonImage() {
        when (lemonState) {
            "select" -> {
                lemonState = "squeeze"
                lemonSize = (2..5).random()
                squeezeCount = 0
            }
            "squeeze" -> {
                squeezeCount++
                lemonSize--
                if(lemonSize == 0) {
                    lemonState = "drink"
                    lemonSize = -1
                }
            }
            "drink" -> lemonState = "restart"
            "restart" -> lemonState = "select"
        }
        setLemonElments()
    }

    private fun setLemonElments() {
        // 텍스트뷰와 이미지뷰 내용 변경
        val textLemon:TextView = findViewById(R.id.text_lemon)
        when (lemonState) {
            "select" -> {
                textLemon.text = "Click to select a lemon!!"
                imglemon!!.setImageResource(R.drawable.lemon_tree)
            }
            "squeeze" -> {
                textLemon.text = getString(R.string.lemon_squeeze)
                imglemon!!.setImageResource(R.drawable.lemon_squeeze)
            }
            "drink" -> {
                textLemon.text = getString(R.string.lemon_drink)
                imglemon!!.setImageResource(R.drawable.lemon_drink)
            }
            "restart" -> {
                textLemon.text = getString(R.string.lemon_empty_glass)
                imglemon!!.setImageResource(R.drawable.lemon_restart)
            }
        }
    }
    fun showSnackbar() : Boolean {
        if(lemonState != "squeeze") return false
        val stext = getString(R.string.squeeze_count, squeezeCount)
        // Popup : Toast, Snackbar
        Snackbar.make(findViewById(R.id.lemon_layout), stext,
            Snackbar.LENGTH_SHORT).show()
        return true
    }
}