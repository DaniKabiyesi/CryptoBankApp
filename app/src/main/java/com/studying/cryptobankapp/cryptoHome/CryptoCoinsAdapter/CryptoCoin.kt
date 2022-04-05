package com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter

import com.studying.cryptobankapp.cryptoInfo.cryptoChipsAdapter.CryptoChips
import com.studying.cryptobankapp.cryptoInfo.cryptoTeamsAdapter.CryptoTeams
import java.io.Serializable

data class CryptoCoin(
    val cryptoName: String,
    val ranking: String,
    var favorite: Boolean,
    var description: String,
    var teams: CryptoTeams,
    var chips: CryptoChips,
) : Serializable {

}