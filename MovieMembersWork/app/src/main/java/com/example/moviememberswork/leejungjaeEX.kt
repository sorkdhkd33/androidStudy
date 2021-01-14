package com.example.moviememberswork

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviememberswork.databinding.ActivityForeignerEXBinding
import com.example.moviememberswork.databinding.ActivityLeejungjaeEXBinding

class leejungjaeEX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityLeejungjaeEXBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.LeeJungJaebtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%9D%B4%EC%A0%95%EC%9E%AC&oquery=%EA%B9%80%ED%98%9C%EC%88%98&tqi=U%2BWrtwp0YiRsse%2FG8N4ssssssWh-224630"))
            startActivity(intent)
        }
    }
}