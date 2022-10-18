package com.example.albumapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.albumapp.data.Album

class AlbumAdapter(val context: Context, val albumList: MutableList<Album>) : RecyclerView.Adapter<AlbumAdapter.MyViewHolder>() {
    // 아이템뷰 객체를 생성하기 위한 내부 클래스
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var title: TextView = itemView.findViewById(R.id.title)
        var songs: TextView = itemView.findViewById(R.id.count)
        var thumbnail: ImageView = itemView.findViewById(R.id.thumbnail)
        var overflow: ImageView = itemView.findViewById(R.id.overflow)
    }
    // 아이템뷰 객체를 생성하는 메소드
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.album_card, parent, false)
        return MyViewHolder(itemView)
    }
    // 아이템뷰에 하나의 아이템 객체를 바인딩하는 메소드
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val album = albumList[position]
        holder.title.text = album.name
        holder.songs.text = album.numOfSongs.toString() + " Songs"
        holder.thumbnail.setImageResource(album.thumbnail)
        holder.overflow.setOnClickListener { showPopupMenu(holder.overflow, album) }
    }
    // 리스트로 나영한 아이템 객체의 개수
    override fun getItemCount(): Int {
        return albumList.size
    }

    // popup 메뉴 보이기
    private fun showPopupMenu(view: View, album: Album){
        val popup = PopupMenu(context, view)
        val inflater = popup.menuInflater
        inflater.inflate(R.menu.menu_album, popup.menu)
        popup.show()
    }
}