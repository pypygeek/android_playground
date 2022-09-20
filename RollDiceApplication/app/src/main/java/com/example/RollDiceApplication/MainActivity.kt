package com.example.RollDiceApplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // 배열 선언
        val images:Array<Int> = arrayOf(R.drawable.dice_1,R.drawable.dice_2,R.drawable.dice_3,R.drawable.dice_4,R.drawable.dice_5,R.drawable.dice_6)
        val title:Array<String> = arrayOf("1", "2", "3", "4", "5", "6") // 배열에 글자 넣는 방법
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

            // 이미지 뷰에 주사위 숫자의 이미지 표시하기

            val diceImg:ImageView = findViewById(R.id.diceImg)

            /*
            if(number == 1) diceImg.setImageResource(R.drawable.dice_1)
            else if (number == 2) diceImg.setImageResource(R.drawable.dice_2)
            else if (number == 3) diceImg.setImageResource(R.drawable.dice_3)
            else if (number == 4) diceImg.setImageResource(R.drawable.dice_4)
            else if (number == 5) diceImg.setImageResource(R.drawable.dice_5)
            else diceImg.setImageResource(R.drawable.dice_6)
            */

            /*
            when (number) {
                1 -> diceImg.setImageResource(R.drawable.dice_1)
                2 -> diceImg.setImageResource(R.drawable.dice_2)
                3 -> diceImg.setImageResource(R.drawable.dice_3)
                4 -> diceImg.setImageResource(R.drawable.dice_4)
                5 -> diceImg.setImageResource(R.drawable.dice_5)
                6 -> diceImg.setImageResource(R.drawable.dice_6)
            }
            */

            diceImg.setImageResource(images[number - 1])
        }
    }

    fun roll2(siders:Int) = (1..siders).random()
}