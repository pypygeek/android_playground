package com.example.seoultour

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter (val context: Context, val data: Array<Array<Any>>) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {
    // 내부클래스 - ItemView 객체를 생성하기 위한 클레스
    class ItemViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val photo: ImageView = view.findViewById(R.id.imageView)
        val place_title: TextView = view.findViewById(R.id.place_title)
        val address: TextView = view.findViewById(R.id.address)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        // item_layout.xml 소스를 컴파일해서 메모리에 생성 : inflate
        val itemLayout = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return ItemViewHolder(itemLayout) // inflate 시켜서 생성된 뷰를 가지고 ViewHolder 객체 생성
    }
    // itemView 객체의 각 위젯에 데이터를 결합시켜서 itemView를 완성해 줌
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item:Array<Any> = data[position]
        holder.place_title.text = item[0].toString() // Any ---> String
        holder.address.text = item[1].toString()    // Any ---> String
        holder.photo.setImageResource(item[3].toString().toInt()) // Any ---> String ---> Int 변환
    }
    
    // itemView를 생성할 데이터의 개수
    override fun getItemCount(): Int {
        return data.size // 배열 데이터 원소 개수 반환
    }
}