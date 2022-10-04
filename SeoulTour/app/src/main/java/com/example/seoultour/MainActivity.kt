package com.example.seoultour

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    val photo = arrayOf(R.drawable.tour1, R.drawable.tour2, R.drawable.tour3, R.drawable.tour5,
        R.drawable.tour6, R.drawable.tour7, R.drawable.tour8, R.drawable.tour9, R.drawable.tour10)

    val places = arrayOf(arrayOf("경복궁", "서울특별시 종로구 세종로 사직로 161",
        "박물관과 정원이 있는 거대한 14세기 왕궁이며 무료 가이드 투어가 제공됩니다.", photo[0]),
        arrayOf("남산타워", "서울특별시 용산구 용산2가동 남산공원길 105",
            "1980년에 문을 연 이 상징적인 타워는 도심의 탁 트인 전망을 자랑하며 회전식 레스토랑을 이용할 수 있습니다.", photo[1]),
        arrayOf("익선동", "서울특별시 종로구", "카페거리와 볼거리가 많은 장소입니다.", photo[2]),
        arrayOf("롯데월드", "서울특별시 송파구 잠실동 올림픽로 240",
            "놀이기구, 물미끄럼틀, 해양생물 전시관을 한 곳에서 즐길 수 있는 가족형 어드벤처 파크입니다.", photo[3]),
        arrayOf("롯데타워", "서울특별시 송파구 잠실6동 올림픽로 300",
            "123층 높이의 대규모 초고층 건물에 고급 호텔과 멋진 전망을 볼 수 있는 전망대가 있습니다.", photo[4]),
        arrayOf("창덕궁", "서울특별시 종로구 와룡동 율곡로 99", "투어를 이용하여 조선 왕조의 궁전과 주변 정원을 둘러볼 수 있습니다.", photo[5]),
        arrayOf("북촌한옥마을", "서울특별시 종로구 계동 계동길 37", "세기를 재현해 놓은 마을로 좁은 골목을 따라 전통 가옥이 즐비해 있습니다.", photo[6]),
        arrayOf("서울숲공원", "서울특별시 성동구 성수동1가 뚝섬로 273",
            "나무가 많고 자전거 도로가 있는 넓은 공원으로 장미, 호수, 나비 정원이 있고 사슴에게 먹이를 줄 수 있습니다.", photo[7]),
        arrayOf("창덕궁", "서울특별시 종로구 서린동 청계천로 1",
            "책로, 다리, 녹지가 있는 휴식 공간으로 개울 주변으로 복원공사가 이루어졌습니다.", photo[8])
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 1) 데이터 소스 = place 배열
        // 2) 어댑터 객체 생성
        val adapter = ItemAdapter(this, places as Array<Array<Any>>)
        // 3) recyclerview 객체 참조 후 어댑터 등록하기
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = adapter
    }
}