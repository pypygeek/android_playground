package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.viewpager.fragment.PosterFragment

class FragmentSlideAdapter(adapter: FragmentActivity) : FragmentStateAdapter(adapter) {
    private val posters = listOf<Int>(R.drawable.movie1, R.drawable.movie2,
        R.drawable.movie3, R.drawable.movie4, R.drawable.movie5, R.drawable.movie6,
        R.drawable.movie7, R.drawable.movie8)
    private val titles = listOf<String>("아이캔 스피크","살인자의 기억법","베이비 드라이버",
        "킬러의 보디가드","아메리칸 메이드","언비저블 게스트",
        "그것","택시운전사")
    private val descs = listOf<String>("2017.09.21 개봉 | 119분","2017.09.06 개봉 | 118분",
        "2017.09.19 개봉 | 113분", "2017.08.30 개봉 | 118분",
        "2017.09.14 개봉 | 115분","2017.09.21 개봉 | 106분",
        "2017.09.06 개봉 | 135분","2017.08.02 개봉 | 137분")

    override fun getItemCount(): Int {
        return posters.size
    }

    override fun createFragment(position: Int): Fragment {
        return when(position) {
            0 -> PosterFragment.newInstance(posters[0],titles[0],descs[0])
            1 -> PosterFragment.newInstance(posters[1],titles[1],descs[1])
            2 -> PosterFragment.newInstance(posters[2],titles[2],descs[2])
            3 -> PosterFragment.newInstance(posters[3],titles[3],descs[3])
            4 -> PosterFragment.newInstance(posters[4],titles[4],descs[4])
            5 -> PosterFragment.newInstance(posters[5],titles[5],descs[5])
            6 -> PosterFragment.newInstance(posters[6],titles[6],descs[6])
            7 -> PosterFragment.newInstance(posters[7],titles[7],descs[7])
            else-> PosterFragment.newInstance(posters[7],titles[7],descs[7])
        }
    }
}