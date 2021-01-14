package com.example.moviememberswork

import android.app.Activity
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviememberswork.databinding.ActivityForeignerEXBinding
import com.example.moviememberswork.databinding.ActivityKimhyesooEXBinding
import com.example.moviememberswork.databinding.ActivityKimyoonsukEXBinding

class kimhyesooEX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityKimhyesooEXBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.KimHyeSoobtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EA%B9%80%ED%98%9C%EC%88%98&oquery=%EC%A0%84%EC%A7%80%ED%98%84&tqi=U%2BWq%2Bdp0JXossTYbckVssssssHN-367035"))
            startActivity(intent)
        }
    }
}