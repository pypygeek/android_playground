package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    private lateinit var pager: ViewPager2
    private var mlist: MutableList<Int> = mutableListOf()
    private lateinit var adapter: ViewPagerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pager = findViewById(R.id.viewpager)
        adapter = ViewPagerAdapter(mlist)
        //pager.adapter = adapter
        pager.adapter = FragmentSlideAdapter(this)
        //prepare()
    }
    fun prepare() {
        mlist.add(R.drawable.movie1)
        mlist.add(R.drawable.movie2)
        mlist.add(R.drawable.movie3)
        mlist.add(R.drawable.movie4)
        mlist.add(R.drawable.movie5)
        mlist.add(R.drawable.movie6)
        mlist.add(R.drawable.movie7)
        mlist.add(R.drawable.movie8)

        adapter.notifyDataSetChanged()
    }
}