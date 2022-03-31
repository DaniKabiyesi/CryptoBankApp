package com.studying.cryptobankapp.cryptoInfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.studying.cryptobankapp.databinding.ActivityCryptoCoinInfoBinding

class CryptoCoinInfoActivity : AppCompatActivity() {

    lateinit var binding: ActivityCryptoCoinInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =   ActivityCryptoCoinInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
//    private fun initRecyclerView(){
//        setCr
//    }

//    private fun setCryptoChipsAdapter(){
//        val recyclerCryptoChips = binding.chips
//    }
}