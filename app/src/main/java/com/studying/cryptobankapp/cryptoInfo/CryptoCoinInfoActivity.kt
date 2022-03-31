package com.studying.cryptobankapp.cryptoInfo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.studying.cryptobankapp.cryptoInfo.cryptoChipsAdapter.CryptoChips
import com.studying.cryptobankapp.cryptoInfo.cryptoChipsAdapter.CryptoChipsAdapter
import com.studying.cryptobankapp.cryptoInfo.cryptoTeamsAdapter.CryptoTeams
import com.studying.cryptobankapp.cryptoInfo.cryptoTeamsAdapter.CryptoTeamsAdapter
import com.studying.cryptobankapp.databinding.ActivityCryptoCoinInfoBinding
import com.studying.cryptobankapp.utils.customview.lists.cryptoChipsCollection
import com.studying.cryptobankapp.utils.customview.lists.cryptoTeamsCollection

class CryptoCoinInfoActivity : AppCompatActivity() {

    lateinit var binding: ActivityCryptoCoinInfoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =   ActivityCryptoCoinInfoBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        setCryptoChipsAdapter()
        setCryptoTeamsAdapter()
    }

    private fun setCryptoChipsAdapter(){
        val recyclerCryptoChips = binding.chipsRecyclerView
        val chipsList: MutableList<CryptoChips> = mutableListOf()

        chipsList.addAll(cryptoChipsCollection)

        val cryptoAdapter = CryptoChipsAdapter(this, chipsList)
        recyclerCryptoChips.adapter = cryptoAdapter
    }

    private fun setCryptoTeamsAdapter(){
        val recyclerCryptoTeams = binding.teamsRecyclerView
        val teamsList: MutableList<CryptoTeams> = mutableListOf()

        teamsList.addAll(cryptoTeamsCollection)

        val cryptoAdapter = CryptoTeamsAdapter(this, teamsList)
        recyclerCryptoTeams.adapter = cryptoAdapter
    }
}