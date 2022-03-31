package com.studying.cryptobankapp.cryptoHome

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.studying.cryptobankapp.databinding.AccessCryptoCoinsBinding

class AccessCryptoCoins @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttrs: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttrs) {

    private val binding = AccessCryptoCoinsBinding.inflate(LayoutInflater.from(context), this, true)

    private var state: CryptoCoinsState = CryptoCoinsState.IsNotFavorite

    init {
        refreshState()
    }

    private fun refreshState() {
        binding.favoriteIconImageView.isEnabled = state.favorite
        refreshDrawableState()
    }

    fun setIsFavorite() {
        state = CryptoCoinsState.IsFavorite
        refreshState()
    }

    fun setIsNotFavorite() {
        state = CryptoCoinsState.IsNotFavorite
        refreshState()
    }

    fun setCoinsName(cryptoName: String) {
        binding.cryptoCoinTextView.text = cryptoName
    }

    fun setRankingCoin(cryptoRanking: String) {
        binding.cryptoCountTextView.text = cryptoRanking
    }

    open class CryptoCoinsState(val favorite: Boolean) {
        object IsNotFavorite : CryptoCoinsState(true)
        object IsFavorite : CryptoCoinsState(false)
    }
}