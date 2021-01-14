package com.example.moviememberswork

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviememberswork.databinding.ActivityForeignerEXBinding
import com.example.moviememberswork.databinding.ActivityJunjihyeonEXBinding

class junjihyeonEX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityJunjihyeonEXBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Junjihyeonbtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%A0%84%EC%A7%80%ED%98%84&oquery=%EA%B9%80%ED%98%9C%EC%88%99&tqi=U%2BWqJlp0JywssFI4ipGssssst2Z-147018"))
            startActivity(intent)
        }
    }
}