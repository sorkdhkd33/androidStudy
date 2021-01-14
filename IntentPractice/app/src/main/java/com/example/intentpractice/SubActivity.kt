package com.example.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice.databinding.ActivityMainBinding
import com.example.intentpractice.databinding.ActivitySubBinding

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySubBinding.inflate(layoutInflater)
        setContentView(binding.root)

        if(intent.hasExtra("msg"))
        {
            binding.tvGetMsg.text = intent.getStringExtra("msg")// 서브 액티비티에 존재하는 텍스트 뷰에다가 helloworld가 넘겨져옴

        }
    }
}