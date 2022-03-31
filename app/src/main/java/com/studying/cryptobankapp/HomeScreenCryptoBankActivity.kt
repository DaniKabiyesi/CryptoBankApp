package com.studying.cryptobankapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.studying.cryptobankapp.R
import com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter.CryptoCoin
import com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter.CryptoCoinsAdapter
import com.studying.cryptobankapp.databinding.ActivityHomeScreenCryptoBankBinding
import com.studying.cryptobankapp.utils.customview.lists.cryptoCoinsCollection

class HomeScreenCryptoBankActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeScreenCryptoBankBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenCryptoBankBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        initOptionMenu()

    }

    private fun initRecyclerView() {
        val recyclerCryptoCoins = binding.buttonRecyclerView
        val cryptoList: MutableList<CryptoCoin> = mutableListOf()

        cryptoList.addAll(cryptoCoinsCollection)

        val cryptoAdapter = CryptoCoinsAdapter(this, cryptoList)
        recyclerCryptoCoins.adapter = cryptoAdapter
    }

    private fun initOptionMenu() {
        with(binding.toolbar) {
            this.inflateMenu(R.menu.crypto_menu)
            menu.findItem(R.id.action_exit).setOnMenuItemClickListener {
                Toast.makeText(this@HomeScreenCryptoBankActivity, "teste", Toast.LENGTH_SHORT)
                    .show()
                true
            }
        }
    }
}