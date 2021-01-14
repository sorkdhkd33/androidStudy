package com.example.practice20201224

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class calactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calactivity)

        val textView: TextView =findViewById(R.id.hello)
    }

    override fun <T : View?> findViewById(id: Int): T {

    }
}