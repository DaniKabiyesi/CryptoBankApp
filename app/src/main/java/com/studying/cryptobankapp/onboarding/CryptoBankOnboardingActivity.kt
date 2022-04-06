package com.studying.cryptobankapp.onboarding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.studying.cryptobankapp.R
import com.studying.cryptobankapp.databinding.ActivityCryptoBankOnboardingBinding

class CryptoBankOnboardingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCryptoBankOnboardingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCryptoBankOnboardingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        navHostFragment.navController
    }


}