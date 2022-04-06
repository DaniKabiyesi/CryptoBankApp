package com.studying.cryptobankapp.utils.customview.lists

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
                "Bitcoin is a type of virtual currency also called a cryptocurrency. It is like a kind of internet money, but it does not have a centralized system of control over its commercial exchanges, such as a central bank, unlike what happens with “real world” currencies. Hundreds of cryptocurrency specifications exist, the vast majority being similar and derived from the first implemented decentralized currency, bitcoin. The security, integrity and balance of the records of a cryptocurrency system are maintained by a community of miners: members of the general public using their computers to help validate and time transactions, adding them to the record (block chain) according to a defined timing scheme.\n" +
                        "\n" +
                        "The security of a cryptocurrency's records is based on the assumption that most miners are keeping the file honestly, having a financial incentive.",
                CryptoTeams("Satoshi Nakamoto", "Founder", null),
                CryptoChips("Scanty", "Volatile", "BlockChain", "Safety", "Fast")),
            CryptoCoin("(ETH) Ethereum",
                "#2",
                false,
                "Etherium is a type of virtual currency also called a cryptocurrency. It is like a kind of internet money, but it does not have a centralized system of control over its commercial exchanges, such as a central bank, unlike what happens with “real world” currencies. Hundreds of cryptocurrency specifications exist, the vast majority being similar and derived from the first implemented decentralized currency, bitcoin. The security, integrity and balance of the records of a cryptocurrency system are maintained by a community of miners: members of the general public using their computers to help validate and time transactions, adding them to the record (block chain) according to a defined timing scheme.\n" +
                        "\n" +
                        "The security of a cryptocurrency's records is based on the assumption that most miners are keeping the file honestly, having a financial incentive.",
                CryptoTeams("Vitalik Buterin", "Founder", null),
                CryptoChips("Scanty", "Volatile", "BlockChain", "Safety", "Fast")),
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
