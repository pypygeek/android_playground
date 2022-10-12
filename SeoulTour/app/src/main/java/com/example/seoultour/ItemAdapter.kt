package com.example.seoultour

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.core.content.ContextCompat.startActivity
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter (val context: Context, val data: MutableList<Place>?) :
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
        val item:Place = data!!.get(position)   // List에서 position 위치의 원소 가져오기
        holder.place_title.text = item.title // Any ---> String
        holder.address.text = item.address    // Any ---> String
        holder.photo.setImageResource(item.photo) // Any ---> String ---> Int 변환

        // 아이템 클릭할 때 처리하기
        if(position != RecyclerView.NO_POSITION)    {   // 현재 위치가 리싸이클러뷰의 아이템 위치이면
            holder.itemView.setOnClickListener{
                // Toast.makeText(context, "Clicked", Toast.LENGTH_LONG).show()
                // PlaceActivity 실행하기
                val intent = Intent(context, PlaceActivity::class.java) // 인텐트 객체 생성
                startActivity(context, intent, null)    // 안드로이드 커널
            }
        }
    }
    
    // itemView를 생성할 데이터의 개수
    override fun getItemCount(): Int {
        return data!!.size // 배열 데이터 원소 개수 반환
    }
}