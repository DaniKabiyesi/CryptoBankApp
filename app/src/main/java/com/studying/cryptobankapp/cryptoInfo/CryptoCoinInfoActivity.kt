package com.studying.cryptobankapp.cryptoInfo

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
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
        initInterface(coin as CryptoCoin)
//        cryptoCoinInfoData()
        initOptionMenu(coin)
    }

    private fun initInterface(coin: CryptoCoin) {
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
            inflateMenu(R.menu.crypto_coin_info_menu)
            title = coin.cryptoName
            menu.findItem(R.id.action_go_back).setOnMenuItemClickListener {
                val intent =
                    Intent(this@CryptoCoinInfoActivity, HomeScreenCryptoBankActivity::class.java)
                startActivity(intent)
                true
            }
        }
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

//    private fun cryptoCoinInfoData() {
//        val data = intent.extras
//        val coin = data?.getSerializable("coin")
//
//        binding.descriptionTextView.text = coin.toString()
//
//    }

}