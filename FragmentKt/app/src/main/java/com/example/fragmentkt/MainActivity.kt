package com.example.fragmentkt

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmentkt.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)

        setFrag(0)

        binding.btnFragment1
    }

    private fun setFrag(fragNum:Int) {
        val ft = supportFragmentManager.beginTransaction()
        when(fragNum)
        {
             0 -> {
                 ft.replace(R.id.main_frame, Fragment1()).commit()
             }
            1 -> {
                ft.replace(R.id.main_frame, Fragment2()).commit()
            }
            2 -> {
                ft.replace(R.id.main_frame, Fragment3()).commit()
            }
        }
    }
}