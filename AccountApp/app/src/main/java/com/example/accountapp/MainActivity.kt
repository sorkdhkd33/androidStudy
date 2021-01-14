package com.example.accountapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        setTheme(R.style.Theme_AccountApp)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}