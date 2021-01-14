package com.example.moviememberswork

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviememberswork.databinding.ActivityForeignerEXBinding
import com.example.moviememberswork.databinding.ActivityGrandfatherEXBinding

class grandfatherEX : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityGrandfatherEXBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.grandfatherbtn.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://search.naver.com/search.naver?sm=tab_hty.top&where=nexearch&query=%EC%9E%84%EB%8B%AC%ED%99%94&oquery=%EC%9D%B4%EC%8B%AC%EA%B2%B0&tqi=U%2BWqjdp0JXossTyhfuZsssssslh-010108"))
            startActivity(intent)
        }
    }
}