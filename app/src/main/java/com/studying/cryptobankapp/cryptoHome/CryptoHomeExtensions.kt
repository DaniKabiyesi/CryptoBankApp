package com.studying.cryptobankapp.cryptoHome

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.studying.cryptobankapp.R
import com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter.CryptoCoin
import com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter.CryptoCoinAdapterInterface
import com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter.CryptoCoinsAdapter
import com.studying.cryptobankapp.cryptoInfo.CryptoCoinInfoActivity
import com.studying.cryptobankapp.databinding.ActivityHomeScreenCryptoBankBinding

fun Activity.setUpRecyclerView(
    binding: ActivityHomeScreenCryptoBankBinding,
    cryptoList: MutableList<CryptoCoin>,
) {
    val recyclerCryptoCoins = binding.buttonRecyclerView
    val cryptoAdapter = CryptoCoinsAdapter(this, cryptoList)

    cryptoAdapter.notify = object : CryptoCoinAdapterInterface {
        override fun notifyActivity(coin: CryptoCoin) {
            startCoinInfo(this@setUpRecyclerView, coin)
        }
    }
    recyclerCryptoCoins.adapter = cryptoAdapter
}

fun startCoinInfo(context: Context, coin: CryptoCoin) {
    val intent = Intent(context, CryptoCoinInfoActivity::class.java)
    intent.putExtra("coin", coin)
    context.startActivity(intent)
}



