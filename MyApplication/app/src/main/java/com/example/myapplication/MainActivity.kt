package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 화면 디자인 상에 button 아이디를 가지는 콤포넌트(위젯)를 가리키도록 함
        val button:Button = findViewById(R.id.button)

        // button을 눌렀을 때 할 일을 작성하자.
        button.setOnClickListener {
            var number = roll2(6)
            // 화면 디자인 상에 textView 아이디를 가지는 위젯을 가르킨다.
            val textView = findViewById<TextView>(R.id.textView)
            textView.setText(number.toString()) //텍스트뷰의 글자를 변경
        }
    }

    fun roll2(siders:Int) = (1..siders).random()
}