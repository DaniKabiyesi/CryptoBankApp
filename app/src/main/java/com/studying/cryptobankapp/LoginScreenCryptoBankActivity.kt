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
    }


//    private fun loginScreen() {
//        binding.run {
//            if(accessLoginEditText.text.toString().isNotBlank() && )
//
//
//
//
////            accessButton.setOnClickListener {
////                when {
////                    accessLoginEditText.toString().isNotBlank()-> {
////                        val intent = Intent(
////                            this@LoginScreenCryptoBankActivity,
////                            HomeScreenCryptoBankActivity::class.java
////                        )
////                        startActivity(intent)
////                    }
////                    accessButton.text && accessPasswordEditText.toString()
////                        .isBlank() -> {
////                        Toast.makeText(this@LoginScreenCryptoBankActivity,
////                            "teste",
////                            Toast.LENGTH_SHORT).show()
////                    }
////                    accessLoginEditText.toString().isBlank() && accessPasswordEditText.toString()
////                        .isBlank() -> {
////                        Toast.makeText(this@LoginScreenCryptoBankActivity,
////                            "teste",
////                            Toast.LENGTH_SHORT)
////                            .show()
////                    }
////                    accessLoginEditText.toString().isBlank() && accessPasswordEditText.toString()
////                        .isBlank() -> {
////                        Toast.makeText(this@LoginScreenCryptoBankActivity,
////                            "this",
////                            Toast.LENGTH_SHORT)
////                            .show()
////                    }
////                }
////            }
//        }
//    }

//
    private fun nextScreen() {
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