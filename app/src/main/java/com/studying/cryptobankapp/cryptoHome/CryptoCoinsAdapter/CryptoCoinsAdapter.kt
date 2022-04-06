package com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.studying.cryptobankapp.R
import com.studying.cryptobankapp.cryptoHome.AccessCryptoCoinClickListener
import com.studying.cryptobankapp.cryptoHome.AccessCryptoCoins

class CryptoCoinsAdapter(
    private val context: Context,
    private val cryptoCoins: MutableList<CryptoCoin>,
) : RecyclerView.Adapter<CryptoCoinsAdapter.CryptoCoinsViewHolder>() {

    var notify: CryptoCoinAdapterInterface? = null

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): CryptoCoinsViewHolder {
        val cryptoView = LayoutInflater.from(context).inflate(R.layout.coins_list, parent, false)
        return CryptoCoinsViewHolder(cryptoView)
    }

    override fun onBindViewHolder(holder: CryptoCoinsViewHolder, position: Int) {
        val coins = cryptoCoins[position]
        holder.coinsList.setCoinsName(coins.cryptoName)
        holder.coinsList.setRankingCoin(coins.ranking)
        if (coins.favorite) {
            holder.coinsList.setIsFavorite()
        } else {
            holder.coinsList.setIsNotFavorite()
        }
        holder.coinsList.listener = object : AccessCryptoCoinClickListener {
            override fun setFavoriteState() {
                coins.favorite = !coins.favorite
                notifyItemChanged(holder.adapterPosition)
            }

            override fun setCardViewImplementation() {
                notify?.notifyActivity(coins)
            }
        }
    }

    override fun getItemCount(): Int = cryptoCoins.size

    inner class CryptoCoinsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val coinsList: AccessCryptoCoins =
            itemView.findViewById(R.id.listAccessCryptoCoin)
    }

}

interface CryptoCoinAdapterInterface {
    fun notifyActivity(coin: CryptoCoin)
}