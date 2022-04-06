package com.studying.cryptobankapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.studying.cryptobankapp.databinding.ActivitySplashScreenCryptoBankBinding
import com.studying.cryptobankapp.onboarding.CryptoBankOnboardingActivity

@SuppressLint("CustomSplashScreen")
class SplashScreenCryptoBankActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySplashScreenCryptoBankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySplashScreenCryptoBankBinding.inflate(layoutInflater)
        setContentView(binding.root)
        goToNextScreen()


    }

    private fun goToNextScreen() {
        Handler().postDelayed({
            val intent = Intent(
                this,
                CryptoBankOnboardingActivity::class.java
            )
            startActivity(intent)
            finish()

        }, 1600)
    }


}