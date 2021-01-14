package com.example.accountapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.accountapp.databinding.ActivityCategoryEditBinding

class categoryEdit : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        val binding = ActivityCategoryEditBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homebutton.setOnClickListener {
            val intent = Intent(this, Heejung1::class.java)
            startActivity(intent)
        }
    }
}