package com.example.moviememberswork

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviememberswork.databinding.ActivityKimyoonsukEXBinding

class kimyoonsukEX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityKimyoonsukEXBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.KimYoonSukbtn.setOnClickListener {
           val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=1&ie=utf8&query=%EA%B9%80%EC%9C%A4%EC%84%9D"))
           startActivity(intent)
       }
    }
}