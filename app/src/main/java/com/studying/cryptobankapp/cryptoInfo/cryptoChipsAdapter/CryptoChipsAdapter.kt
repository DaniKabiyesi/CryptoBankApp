package com.studying.cryptobankapp.cryptoInfo.cryptoChipsAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.studying.cryptobankapp.R
import com.studying.cryptobankapp.cryptoInfo.AccessCryptoChips

class CryptoChipsAdapter(
    private val context: Context,
    private val cryptoChips: MutableList<CryptoChips>,
) : RecyclerView.Adapter<CryptoChipsAdapter.CryptoChipsViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): CryptoChipsAdapter.CryptoChipsViewHolder {
        val cryptoView = LayoutInflater.from(context).inflate(R.layout.chips_list, parent, false)
        return CryptoChipsViewHolder(cryptoView)
    }

    override fun onBindViewHolder(holder: CryptoChipsAdapter.CryptoChipsViewHolder, position: Int) {
        val chips = cryptoChips[position]
        holder.chipsList.setFifthCryptoChip(chips.fifthCryptoChips)
        holder.chipsList.setSecondCryptoChip(chips.secondCryptoChips)
        holder.chipsList.setThirdCryptoChip(chips.thirdCryptoChips)
        holder.chipsList.setFourthCryptoChip(chips.fourthCryptoChips)
        holder.chipsList.setFifthCryptoChip(chips.fifthCryptoChips)
    }

    override fun getItemCount(): Int = cryptoChips.size

    inner class CryptoChipsViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView){
        val chipsList: AccessCryptoChips = itemView.findViewById<AccessCryptoChips>(R.id.listAccessCryptoChips)
    }

}