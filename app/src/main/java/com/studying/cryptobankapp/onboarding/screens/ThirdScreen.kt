package com.studying.cryptobankapp.onboarding.screens

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.studying.cryptobankapp.LoginScreenCryptoBankActivity
import com.studying.cryptobankapp.databinding.FragmentOnboardingThirdScreenBinding

class ThirdScreen : Fragment() {

    private lateinit var _binding: FragmentOnboardingThirdScreenBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentOnboardingThirdScreenBinding.inflate(
            inflater,
            container,
            false
        )
        setListeners()

        return binding.root
    }

    private fun setListeners() {
        binding.run {
            firstAccessButton.setOnClickListener {
                val intent = goToNextScreen()
                startActivity(intent)
            }
        }
    }

    private fun goToNextScreen(): Intent {
        return Intent(context, LoginScreenCryptoBankActivity::class.java)
    }

}