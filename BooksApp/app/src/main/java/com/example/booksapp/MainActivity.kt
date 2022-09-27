package com.example.booksapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    
    var books = emptyArray<String>() // 책 목록 배열
    var price = emptyArray<Int>()    // 책 가격 배열
    var quantity = emptyArray<Int>() // 책 재고수량 배열
    var selected = 0 // 스피너 선택한 아이템 저장
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        
        setData()

        // 1) 액티비티에 있는 스피너 위젯의 레퍼런스를 가져온다.
        var spinner = findViewById<Spinner>(R.id.spinner)
        // 2) Adapter 객체를 생성하기
        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, books)
        // 3) 스피너에 어댑터 객체 등록하기
        spinner.adapter = adapter
        // 4) 스피너에 아이템 선택 리스너 등록하기
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            // 아이템 선택할 때 실행되는 메소드
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                var title = ""
                when (position) {
                    // 스피너 아이템을 가리키는 인덱스.
                    0 -> title = books[position]
                    1 -> title = books[position]
                    2 -> title = books[position]
                    3 -> title = books[position]
                }
                Toast.makeText(this@MainActivity, title, Toast.LENGTH_LONG).show()
                selected = position
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        val button = findViewById<Button>(R.id.buyButton)
        button.setOnClickListener {
            // editQty 입력 창에서 수량을 얻어오기
            // 구매금액 계산하기
            // 재고량 감소시키기
            // 토스트에 출력하기
            val editText = findViewById<EditText>(R.id.editQty)
            val qty = editText.text.toString().toInt() // 입력박스에 입력된 숫자를 정수를 가져오기.
            val price = qty * price[selected]

            Toast.makeText(this@MainActivity, price.toString(), Toast.LENGTH_LONG).show()
        }
    }
    
    // 기초 데이터를 배열에 저장하는 함수
    fun setData() {
        // books 배열에 원소 추가.
        // books 배열은 고정길이배열. 정적배열
        books = books.plus("cpp")
        books = books.plus("Java")
        books += "Web Design"
        books += "Spring Framework"

        price = arrayOf(11000, 13000, 10800, 21300)

        quantity = arrayOf(8, 11, 5, 3)
    }
}