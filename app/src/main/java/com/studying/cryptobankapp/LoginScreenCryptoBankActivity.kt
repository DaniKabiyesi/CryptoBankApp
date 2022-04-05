package com.studying.cryptobankapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.studying.cryptobankapp.cryptoInfo.CryptoCoinInfoActivity
import com.studying.cryptobankapp.databinding.ActivityLoginScreenCryptoBankBinding

class LoginScreenCryptoBankActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginScreenCryptoBankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenCryptoBankBinding.inflate(layoutInflater)
        setContentView(binding.root)
        nextScreen()
        signUpScreen()
    }


    private fun nextScreen() {
        binding.run {
            accessButton.setOnClickListener {
                if (accessLoginEditText.isValid() && accessPasswordEditText.isValid()) {
                    val intent = Intent(
                        this@LoginScreenCryptoBankActivity,
                        HomeScreenCryptoBankActivity::class.java
                    )
                    startActivity(intent)
                } else {
                    Toast.makeText(this@LoginScreenCryptoBankActivity, "teste", Toast.LENGTH_SHORT)
                        .show()
                }
            }
        }
    }

    private fun signUpScreen() {
        binding.run {
            createAccountButton.setOnClickListener {
                val intent = Intent(this@LoginScreenCryptoBankActivity, SignUpScreenCryptoBankActivity::class.java)
                startActivity(intent)
            }
        }
    }


}