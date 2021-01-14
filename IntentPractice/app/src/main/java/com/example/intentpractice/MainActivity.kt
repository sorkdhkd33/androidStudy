package com.example.intentpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnA.setOnClickListener {
            val intent = Intent(this@MainActivity, SubActivity::class.java)
            intent.putExtra("msg", binding.tvSendMsg.text.toString()) //helloworld라는 텍스트 값을 담은 뒤  msg라는 키로 잡혔다.
            startActivity(intent)
        }
    }


}