package com.example.moviememberswork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.moviememberswork.databinding.ActivityMembersinfoBinding

class membersinfo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMembersinfoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.KimYoonSuk.setOnClickListener{
            val intent = Intent(this, kimyoonsukEX::class.java)
            startActivity(intent)
        }

        binding.KimHyeSoo.setOnClickListener{
            val intent = Intent(this, kimhyesooEX::class.java)
            startActivity(intent)
        }

        binding.Junjihyeon.setOnClickListener{
            val intent = Intent(this, junjihyeonEX::class.java)
            startActivity(intent)
        }

        binding.LeeJungJae.setOnClickListener{
            val intent = Intent(this, leejungjaeEX::class.java)
            startActivity(intent)
        }


        binding.Gum.setOnClickListener{
            val intent = Intent(this, gumEX::class.java)
            startActivity(intent)
        }

        binding.grandfather.setOnClickListener{
            val intent = Intent(this, grandfatherEX::class.java)
            startActivity(intent)
        }

        binding.Foreigner.setOnClickListener{
            val intent = Intent(this, foreignerEX::class.java)
            startActivity(intent)
        }


        binding.btn1.setOnClickListener{
            val intent = Intent(this, submembers::class.java)
            startActivity(intent)
        }
    }
}