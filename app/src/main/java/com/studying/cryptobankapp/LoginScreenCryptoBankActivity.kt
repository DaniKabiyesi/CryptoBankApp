package com.studying.cryptobankapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.studying.cryptobankapp.databinding.ActivityLoginScreenCryptoBankBinding

class LoginScreenCryptoBankActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginScreenCryptoBankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginScreenCryptoBankBinding.inflate(layoutInflater)
        setContentView(binding.root)
        goToHomeScreen()
        goToSignUpScreen()
    }


    private fun goToHomeScreen() {
        binding.run {
            accessButton.setOnClickListener {
                if (loginValidation()) {
                    val intent = setHomeScreen()
                    startActivity(intent)
                } else {
                    setLoginValidationToast()
                }
            }
        }
    }

    private fun goToSignUpScreen() {
        binding.run {
            createAccountButton.setOnClickListener {
                val intent = setSignUpScreen()
                startActivity(intent)
            }
        }
    }

    private fun setSignUpScreen(): Intent {
        return Intent(this@LoginScreenCryptoBankActivity,
            SignUpScreenCryptoBankActivity::class.java)
    }

    private fun setLoginValidationToast() {
        Toast.makeText(this@LoginScreenCryptoBankActivity, "Fill in all fields", Toast.LENGTH_SHORT)
            .show()
    }

    private fun setHomeScreen(): Intent {
        return Intent(
            this@LoginScreenCryptoBankActivity,
            HomeScreenCryptoBankActivity::class.java
        )
    }

    private fun ActivityLoginScreenCryptoBankBinding.loginValidation() =
        accessLoginEditText.isValid() && accessPasswordEditText.isValid()




}