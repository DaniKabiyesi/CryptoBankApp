package com.studying.cryptobankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.studying.cryptobankapp.cryptoInfo.CryptoCoinInfoActivity
import com.studying.cryptobankapp.databinding.ActivityLoginScreenCryptoBankBinding

class LoginScreenCryptoBankActivity : AppCompatActivity() {

    private lateinit var binding : ActivityLoginScreenCryptoBankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenCryptoBankBinding.inflate(layoutInflater)
        setContentView(binding.root)
        nextScreen()
    }

    private fun nextScreen(){
        binding.run {
            accessButton.setOnClickListener {
                val intent = Intent(
                    this@LoginScreenCryptoBankActivity,
                    HomeScreenCryptoBankActivity::class.java
                )
                startActivity(intent)
            }
        }
    }


}