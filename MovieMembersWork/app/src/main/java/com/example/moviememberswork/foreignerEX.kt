package com.example.moviememberswork

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviememberswork.databinding.ActivityForeignerEXBinding

class foreignerEX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityForeignerEXBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.Foreignerbtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%9D%B4%EC%8B%AC%EA%B2%B0&oquery=%EC%9D%B4%EC%8B%A0%EC%A0%9C&tqi=U%2BWqisp0YiRssf5BQ0Nssssss4C-188723"))
            startActivity(intent)
        }
    }
}