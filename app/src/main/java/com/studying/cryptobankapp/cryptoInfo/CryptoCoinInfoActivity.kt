package com.studying.cryptobankapp.cryptoInfo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter.CryptoCoin
import com.studying.cryptobankapp.cryptoInfo.cryptoChipsAdapter.CryptoChips
import com.studying.cryptobankapp.cryptoInfo.cryptoChipsAdapter.CryptoChipsAdapter
import com.studying.cryptobankapp.cryptoInfo.cryptoTeamsAdapter.CryptoTeams
import com.studying.cryptobankapp.cryptoInfo.cryptoTeamsAdapter.CryptoTeamsAdapter
import com.studying.cryptobankapp.databinding.ActivityCryptoCoinInfoBinding
import com.studying.cryptobankapp.utils.customview.lists.*

class CryptoCoinInfoActivity : AppCompatActivity() {

    lateinit var binding: ActivityCryptoCoinInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCryptoCoinInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val data = intent.extras
        val coin = data?.getSerializable("coin")
        initInterface(coin as CryptoCoin)
        cryptoCoinInfoData()
    }

    private fun initInterface(coin: CryptoCoin) {
        setCryptoChipsAdapter(coin)
        setCryptoTeamsAdapter(coin)
        verification(coin, binding.descriptionTextView)
    }

    private fun setCryptoChipsAdapter(coin: CryptoCoin) {
        val recyclerCryptoChips = binding.chipsRecyclerView
        val chipsList: MutableList<CryptoChips> = mutableListOf()

        setChips(coin).let { chipsList.addAll(it) }

        val cryptoAdapter = CryptoChipsAdapter(this, chipsList)
        recyclerCryptoChips.adapter = cryptoAdapter
    }

    private fun setCryptoTeamsAdapter(coin: CryptoCoin) {
        val recyclerCryptoTeams = binding.teamsRecyclerView
        val teamsList: MutableList<CryptoTeams> = mutableListOf()

        setTeam(coin).let { teamsList.addAll(it) }

        val cryptoAdapter = CryptoTeamsAdapter(this, teamsList)
        recyclerCryptoTeams.adapter = cryptoAdapter
    }

    private fun cryptoCoinInfoData() {
        val data = intent.extras
        val coin = data?.getSerializable("coin")

        binding.descriptionTextView.text = coin.toString()

    }

}