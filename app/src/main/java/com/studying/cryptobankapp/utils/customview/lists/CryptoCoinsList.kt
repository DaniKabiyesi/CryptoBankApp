package com.studying.cryptobankapp.utils.customview.lists

import com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter.CryptoCoin
import com.studying.cryptobankapp.cryptoInfo.cryptoChipsAdapter.CryptoChips
import com.studying.cryptobankapp.cryptoInfo.cryptoTeamsAdapter.CryptoTeams

val cryptoCoinsCollection: Collection<CryptoCoin> = (
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

val cryptoChipsCollection: Collection<CryptoChips> = (
        listOf(
            CryptoChips("tag1", "tag2", "tag3", "tag4", "tag5")
        )
        )

val cryptoTeamsCollection: Collection<CryptoTeams> = (
        listOf(
            CryptoTeams("Satoshi Nakamoto", "Founder", null),
            CryptoTeams("Satoshi Nakamoto", "Founder", null),
            CryptoTeams("Satoshi Nakamoto", "Founder", null),
            CryptoTeams("Satoshi Nakamoto", "Founder", null),
            CryptoTeams("Satoshi Nakamoto", "Founder", null),
            CryptoTeams("Satoshi Nakamoto", "Founder", null)
        )
        )