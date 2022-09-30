package com.example.kotlinclass

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dataSet = DataSet() // 객체 생성
        val myData = dataSet.loadData() // 화면에 표시할 데이터 집합
        val adapter= ItemAdapter(applicationContext, myData)
        val recycler = findViewById<RecyclerView>(R.id.recycler_view)
        recycler.adapter = adapter

    }
}