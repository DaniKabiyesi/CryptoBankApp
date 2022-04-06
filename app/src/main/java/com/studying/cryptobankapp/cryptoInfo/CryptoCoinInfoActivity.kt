package com.studying.cryptobankapp.cryptoInfo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.studying.cryptobankapp.HomeScreenCryptoBankActivity
import com.studying.cryptobankapp.R
import com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter.CryptoCoin
import com.studying.cryptobankapp.cryptoInfo.cryptoChipsAdapter.CryptoChips
import com.studying.cryptobankapp.cryptoInfo.cryptoChipsAdapter.CryptoChipsAdapter
import com.studying.cryptobankapp.cryptoInfo.cryptoTeamsAdapter.CryptoTeams
import com.studying.cryptobankapp.cryptoInfo.cryptoTeamsAdapter.CryptoTeamsAdapter
import com.studying.cryptobankapp.databinding.ActivityCryptoCoinInfoBinding

class CryptoCoinInfoActivity : AppCompatActivity() {

    lateinit var binding: ActivityCryptoCoinInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCryptoCoinInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data = intent.extras
        val coin = data?.getSerializable("coin")
        initMyCoinInfo(coin as CryptoCoin)
        initOptionMenu(coin)
    }

    private fun initMyCoinInfo(coin: CryptoCoin) {
        setCryptoChipsAdapter(coin)
        setCryptoTeamsAdapter(coin)
        setDescription(coin)
    }

    private fun setDescription(coin: CryptoCoin) {
        binding.run {
            descriptionTextView.text = coin.description
        }
    }

    private fun initOptionMenu(coin: CryptoCoin) {
        with(binding.toolbar) {
            setMenuCoinInfo(coin)
            menu.findItem(R.id.action_go_back).setOnMenuItemClickListener {
                finish()
                true
            }
        }
    }

    private fun MaterialToolbar.setMenuCoinInfo(coin: CryptoCoin) {
        inflateMenu(R.menu.crypto_coin_info_menu)
        title = coin.cryptoName
    }


    private fun setActivity() {
        val intent =
            Intent(this@CryptoCoinInfoActivity, HomeScreenCryptoBankActivity::class.java)
        startActivity(intent)
    }

    private fun setCryptoChipsAdapter(coin: CryptoCoin) {
        val recyclerCryptoChips = binding.chipsRecyclerView
        val chipsList: MutableList<CryptoChips> = mutableListOf()

        chipsList.addAll(listOf(coin.chips))

        val cryptoAdapter = CryptoChipsAdapter(this, chipsList)
        recyclerCryptoChips.adapter = cryptoAdapter
    }

    private fun setCryptoTeamsAdapter(coin: CryptoCoin) {
        val recyclerCryptoTeams = binding.teamsRecyclerView
        val teamsList: MutableList<CryptoTeams> = mutableListOf()

        teamsList.addAll(listOf(coin.teams))

        val cryptoAdapter = CryptoTeamsAdapter(this, teamsList)
        recyclerCryptoTeams.adapter = cryptoAdapter
    }

}