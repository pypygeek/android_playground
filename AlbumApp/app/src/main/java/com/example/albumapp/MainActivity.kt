package com.example.albumapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.albumapp.data.Album

class MainActivity : AppCompatActivity() {
    private var recyclerView: RecyclerView? = null
    private var adapter: AlbumAdapter? = null
    private var albumList: MutableList<Album> = mutableListOf()  // 비어있는 리스트 객체로 초기화
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById<Toolbar>(R.id.toolbar)
        supportActionBar?.hide()  // 디폴트 액션바는 안보이게 함
        setSupportActionBar(toolbar)  // Toolbar를 액션바로 설정
        // 1) RecyclerView reference 받아오기
        recyclerView = findViewById(R.id.recycler_view)
        // 2) Adapter 객체 생성
        adapter = AlbumAdapter(this, albumList)  // Context, 아이템으로 표시할 데이터 집합
        // 3) RecyclerView layoutmanager 설정
        recyclerView!!.layoutManager = GridLayoutManager(this, 2)
        // 4) RecyclerView adapter 설정
        recyclerView!!.adapter = adapter
        setAlbums()
        findViewById<ImageView>(R.id.backdrop).setImageResource(R.drawable.cover)
    }

    private fun setAlbums() {
        val covers = intArrayOf(
            R.drawable.album1,
            R.drawable.album2,
            R.drawable.album3,
            R.drawable.album4,
            R.drawable.album5,
            R.drawable.album6,
            R.drawable.album7,
            R.drawable.album8,
            R.drawable.album9,
            R.drawable.album10,
            R.drawable.album11)
        var a = Album("Love poem", 1, covers[0])
        albumList!!.add(a)
        a = Album("CHANNEL 8", 11, covers[1])
        albumList!!.add(a)
        a = Album("Purpose-The 2nd Album", 12, covers[2])
        albumList!!.add(a)
        a = Album("항해", 10, covers[3])
        albumList!!.add(a)
        a = Album("Rewind", 5, covers[4])
        albumList!!.add(a)
        a = Album("Feel Special", 7, covers[5])
        albumList!!.add(a)
        a = Album("Speak Your Mind", 17, covers[6])
        albumList!!.add(a)
        a = Album("I met you when I was 18", 17, covers[7])
        albumList!!.add(a)
        a = Album("Hello", 11, covers[8])
        albumList!!.add(a)
        a = Album("Greatest Hits", 17, covers[9])
        albumList!!.add(a)
        adapter!!.notifyDataSetChanged() // AlbumAdapter에게 데이터 집합의 변경을 알려서 반영하도록 함
    }
}