package com.studying.cryptobankapp.onboarding.screens

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.studying.cryptobankapp.R
import com.studying.cryptobankapp.databinding.FragmentOnboardingFirstScreenBinding


class FirstScreen : Fragment() {

    private lateinit var _binding: FragmentOnboardingFirstScreenBinding
    private val binding get() = _binding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {

        _binding = FragmentOnboardingFirstScreenBinding.inflate(
            inflater,
            container,
            false
        )
        nextScreen()

        return binding.root
    }

    private fun nextScreen(){
        binding.run {
            firstAccessButton.setOnClickListener {
                findNavController().navigate(R.id.secondScreen)
            }
        }
    }


}