package com.studying.cryptobankapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.studying.cryptobankapp.databinding.ActivitySignUpScreenCryptoBankBinding

class SignUpScreenCryptoBankActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpScreenCryptoBankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpScreenCryptoBankBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}