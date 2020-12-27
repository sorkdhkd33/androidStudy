package com.example.recyclerviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileList = arrayListOf(
            Profiles(R.drawable.man, "두상민", 23, "개발자"),
            Profiles(R.drawable.woman, "삼상민", 24, "개발자"),
            Profiles(R.drawable.man, "사상민", 25, "개발자"),
            Profiles(R.drawable.woman, "오상민", 63, "개발자"),
            Profiles(R.drawable.man, "육상민", 33, "개발자"),
            Profiles(R.drawable.woman, "칠상민", 29, "개발자"),
            Profiles(R.drawable.man, "팔상민", 33, "개발자"),
            Profiles(R.drawable.woman, "구상민", 23, "개발자"),
            Profiles(R.drawable.man, "십상민", 13, "개발자"),
            Profiles(R.drawable.woman, "일상민", 43, "개발자"),
            Profiles(R.drawable.man, "이상민", 23, "개발자"),
            Profiles(R.drawable.woman, "석상민", 63, "개발자")

        )

        rv_profile.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL)
    }




}