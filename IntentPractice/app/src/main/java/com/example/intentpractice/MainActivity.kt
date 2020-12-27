package com.example.intentpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.intentpractice.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnA.setOnClickListener {
            val 
        }
    }


}