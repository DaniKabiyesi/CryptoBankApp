package com.studying.cryptobankapp.cryptoHome

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.constraintlayout.widget.ConstraintLayout
import com.studying.cryptobankapp.R
import com.studying.cryptobankapp.databinding.AccessCryptoCoinsBinding

class AccessCryptoCoins @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet?,
    defStyleAttrs: Int = 0,
) : ConstraintLayout(context, attrs, defStyleAttrs) {

    private val binding = AccessCryptoCoinsBinding.inflate(LayoutInflater.from(context), this, true)

    var listener: AccessCryptoCoinClickListener? = null

    init {
        binding.favoriteIconImageView.setOnClickListener {
            listener?.setClickListener()
        }
    }

    fun setIsFavorite() {
        binding.favoriteIconImageView.setBackgroundResource(R.drawable.is_favorite)
    }

    fun setIsNotFavorite() {
        binding.favoriteIconImageView.setBackgroundResource(R.drawable.is_not_favorite)
    }

    fun setCoinsName(cryptoName: String) {
        binding.cryptoCoinTextView.text = cryptoName
    }

    fun setRankingCoin(cryptoRanking: String) {
        binding.cryptoCountTextView.text = cryptoRanking
    }

//    open class CryptoCoinsState(val favorite: Boolean) {
//        object IsNotFavorite : CryptoCoinsState(true)
//        object IsFavorite : CryptoCoinsState(false)
//    }
}

interface AccessCryptoCoinClickListener{
    fun setClickListener()
}