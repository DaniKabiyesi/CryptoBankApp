package com.studying.cryptobankapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.studying.cryptobankapp.databinding.ActivitySignUpScreenCryptoBankBinding

class SignUpScreenCryptoBankActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySignUpScreenCryptoBankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpScreenCryptoBankBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setListener()
    }

    private fun setListener() {
        binding.run {
            createAccountButton.setOnClickListener {
                if (signUpValidation()) {
                    val intent = setHomeScreen()
                    startActivity(intent)
                } else {
                    setToast()
                }
            }
        }
    }

    private fun setToast() {
        Toast.makeText(this@SignUpScreenCryptoBankActivity,
            "Fill in all the camps",
            Toast.LENGTH_SHORT)
            .show()
    }

    private fun setHomeScreen(): Intent {
        return Intent(this@SignUpScreenCryptoBankActivity,
            HomeScreenCryptoBankActivity::class.java)
    }

    private fun ActivitySignUpScreenCryptoBankBinding.signUpValidation() =
        loginEditText.isValid() && cpfEditText.isValid() && passwordEditText.isValid() && confirmPasswordEditText.isValid()
}