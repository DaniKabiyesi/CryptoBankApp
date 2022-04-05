package com.studying.cryptobankapp.utils.customview.lists

import android.widget.TextView
import com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter.CryptoCoin
import com.studying.cryptobankapp.cryptoInfo.cryptoChipsAdapter.CryptoChips
import com.studying.cryptobankapp.cryptoInfo.cryptoTeamsAdapter.CryptoTeams

val cryptoCoinsCollection = (
        listOf(
            CryptoCoin("(BTC) Bitcoin", "#1", false),
            CryptoCoin("(ETH) Etherium", "#2", false),
            CryptoCoin("(SOL) Solana", "#3", false),
            CryptoCoin("(BND) Binance Coin", "#4", false),
            CryptoCoin("(XRP) XRP", "#5", false),
            CryptoCoin("(LUNA) Terra", "#6", false),
            CryptoCoin("(AVAX) Avalanche", "#7", false),
            CryptoCoin("(AVAX) Avalanche", "#7", false),
            CryptoCoin("(AVAX) Avalanche", "#7", false),
            CryptoCoin("(AVAX) Avalanche", "#7", false),
            CryptoCoin("(AVAX) Avalanche", "#7", false),
            CryptoCoin("(AVAX) Avalanche", "#7", false),
            CryptoCoin("(AVAX) Avalanche", "#7", false)
        )
        )

val cryptoChipsCollection: MutableList<CryptoChips> = (
        mutableListOf(
            CryptoChips("tag1", "tag2", "tag3", "tag4", "tag5")
        )
        )

val cryptoTeamsCollection: MutableList<CryptoTeams> = (
        mutableListOf(
            CryptoTeams("Satoshi Nakamoto", "Founder", null),
            CryptoTeams("Satoshi Nakamoto", "Founder", null),
            CryptoTeams("Satoshi Nakamoto", "Founder", null),
            CryptoTeams("Satoshi Nakamoto", "Founder", null),
            CryptoTeams("Satoshi Nakamoto", "Founder", null),
            CryptoTeams("Satoshi Nakamoto", "Founder", null)
        )
        )

fun changeTheDescription(coin: CryptoCoin, description: TextView) {
    if (coin.cryptoName == "(BTC) Bitcoin") {
        description.text = descriptionBTC
    }
}

const val descriptionBTC = "descrição btc"

fun verification(coin: CryptoCoin, description: TextView) {
    for (cryptoCoin in cryptoCoinsCollection) {
        if (coin == cryptoCoin) {

            changeTheDescription(coin, description)

            break
        }
    }
}

fun setTeam(coin: CryptoCoin): MutableList<CryptoTeams> {
    var teams = cryptoTeamsCollection
    when (coin.cryptoName) {
        "(BTC) Bitcoin" -> {
            val teamBTC: MutableList<CryptoTeams> = mutableListOf(
                CryptoTeams("Satoshi", "Founder", null
                )
            )
            teams = teamBTC
        }
    }
    return teams
}


fun setChips(coin: CryptoCoin): MutableList<CryptoChips> {
    var chips = cryptoChipsCollection
    when (coin.cryptoName) {
        "(BTC) Bitcoin" -> {
            val chipsBTC: MutableList<CryptoChips> = mutableListOf(
                CryptoChips("btc1", "btc2", "btc3", "btc4", "btc5"
                )
            )
            chips = chipsBTC
        }
    }
    return chips


}

enum class MyCoins{
    BTC_COIN,
    ETH_COIN,
    SOL_COIN,
    BND_COIN,
    XRP_COIN,
    LUNA_COIN,
    AVAX_COIN
}




