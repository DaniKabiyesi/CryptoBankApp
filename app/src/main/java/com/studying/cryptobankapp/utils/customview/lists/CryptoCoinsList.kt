package com.studying.cryptobankapp.utils.customview.lists

import android.app.Activity
import android.content.ContentResolver
import android.content.Context
import android.provider.Settings.Global.getString
import androidx.annotation.StringRes
import androidx.core.content.res.TypedArrayUtils.getString
import com.studying.cryptobankapp.R
import com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter.CryptoCoin
import com.studying.cryptobankapp.cryptoInfo.cryptoChipsAdapter.CryptoChips
import com.studying.cryptobankapp.cryptoInfo.cryptoTeamsAdapter.CryptoTeams

val cryptoCoinsCollection = (
        listOf(
            CryptoCoin(
                "(BTC) Bitcoin",
                "#1",
                false,
                "RWQIUHFRIFQW",
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(ETH) Etherium",
                "#2",
                false,
                R.string.eth_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(SOL) Solana",
                "#3",
                false,
                R.string.sol_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(BND) BinanceCoin",
                "#4",
                false,
                R.string.bnd_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(XRP) XRP",
                "#5",
                false,
                R.string.xrp_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(LUNA) Terra",
                "#6",
                false,
                R.string.luna_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(AVAX) Avalanche",
                "#7",
                false,
                R.string.avax_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(ADA) Cardano",
                "#8",
                false,
                R.string.ada_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(DAI) Dai",
                "#9",
                false,
                R.string.dai_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(ATOM) Cosmos",
                "#10",
                false,
                R.string.atom_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(DOGE) DogeCoin",
                "#11",
                false,
                R.string.doge_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(TRX) TROM",
                "#12",
                false,
                R.string.trx_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5")),
            CryptoCoin("(XLM) Stellar",
                "#13",
                false,
                R.string.xlm_description.toString(),
                CryptoTeams("satoshi", "founder", null),
                CryptoChips("Btc 1", "Btc 2", "Btc 3", "Btc 4", "Btc 5"))
        )
        )

//private fun getString(coin: CryptoCoin) : String {
//    when(coin){
//        cryptoCoinsCollection[0] -> {
//            conversion()
//        }
//    }
//}

//fun conversion(id: Int) : String {
//    var teste = id
//    return
//}

//private fun myDescription(coin: CryptoCoin): Int {
//    var description: Int = 0
//    when (coin) {
//        cryptoCoinsCollection[0] -> {
//            description = R.string.btc_description
//        }
//    }
//    return description
//}
//
//enum class coinDescription {
//    BTC
//}

//val cryptoChipsCollection: MutableList<CryptoChips> = (
//        mutableListOf(
//            CryptoChips("tag1", "tag2", "tag3", "tag4", "tag5")
//        )
//        )
//
//val cryptoTeamsCollection: List<CryptoTeams> = (
//        listOf(
//            CryptoTeams("Satoshi Nakamoto", "Founder", null),
//            CryptoTeams("Satoshi Nakamoto", "Founder", null),
//            CryptoTeams("Satoshi Nakamoto", "Founder", null),
//            CryptoTeams("Satoshi Nakamoto", "Founder", null),
//            CryptoTeams("Satoshi Nakamoto", "Founder", null),
//            CryptoTeams("Satoshi Nakamoto", "Founder", null)
//        )
//        )

//
//fun changeTheDescription(coin: CryptoCoin, description: TextView) {
//    if (coin.cryptoName == "(BTC) Bitcoin") {
//        description.text = descriptionBTC
//    }
//}
//
//const val descriptionBTC = "descrição btc"
//
//fun verification(coin: CryptoCoin, description: TextView) {
//    for (cryptoCoin in cryptoCoinsCollection) {
//        if (coin == cryptoCoin) {
//
//            changeTheDescription(coin, description)
//
//            break
//        }
//    }
//}
//
//fun setTeam(coin: CryptoCoin): List<CryptoTeams> {
//    var teams = cryptoTeamsCollection
//    when (coin.cryptoName) {
//        "(BTC) Bitcoin" -> {
//            val teamBTC: List<CryptoTeams> = mutableListOf(
//                CryptoTeams("Satoshi", "Founder", null
//                )
//            )
//            teams = teamBTC
//        }
//    }
//    return teams
//}
//
//
//fun setChips(coin: CryptoCoin): MutableList<CryptoChips> {
//    var chips = cryptoChipsCollection
//    when (coin.cryptoName) {
//        "(BTC) Bitcoin" -> {
//            val chipsBTC: MutableList<CryptoChips> = mutableListOf(
//                CryptoChips("btc1", "btc2", "btc3", "btc4", "btc5"
//                )
//            )
//            chips = chipsBTC
//        }
//    }
//    return chips
//
//
//}
//
//enum class MyCoins {
//    BTC_COIN,
//    ETH_COIN,
//    SOL_COIN,
//    BND_COIN,
//    XRP_COIN,
//    LUNA_COIN,
//    AVAX_COIN
//}
//
//
//
//
