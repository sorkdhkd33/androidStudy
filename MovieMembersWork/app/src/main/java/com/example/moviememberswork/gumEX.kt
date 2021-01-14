package com.example.moviememberswork

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviememberswork.databinding.ActivityForeignerEXBinding
import com.example.moviememberswork.databinding.ActivityGumEXBinding

class gumEX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityGumEXBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.gumbtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EA%B9%80%ED%98%9C%EC%88%99&oquery=%EB%B0%B0%EC%9A%B0%EA%B9%80%ED%98%9C%EC%88%99&tqi=U%2BWqHwp0YihssBfSLj0ssssst3s-462451"))
            startActivity(intent)
        }
    }


}