package com.studying.cryptobankapp.cryptoInfo.cryptoTeamsAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.studying.cryptobankapp.R
import com.studying.cryptobankapp.cryptoInfo.AccessCryptoTeams

class CryptoTeamsAdapter(
    private val context: Context,
    private val cryptoTeams: MutableList<CryptoTeams>,
) : RecyclerView.Adapter<CryptoTeamsAdapter.CryptoTeamsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CryptoTeamsViewHolder {
        val cryptoView = LayoutInflater.from(context).inflate(R.layout.teams_list, parent, false)
        return CryptoTeamsViewHolder(cryptoView)
    }

    override fun onBindViewHolder(holder: CryptoTeamsViewHolder, position: Int) {
        val teams = cryptoTeams[position]
        teams.tittle?.let { holder.teamsList.setTittle(it) }
        teams.subTittle?.let { holder.teamsList.setSubTittle(it) }
        teams.line?.let { holder.teamsList.setLine(it) }
    }

    override fun getItemCount(): Int = cryptoTeams.size

    inner class CryptoTeamsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val teamsList: AccessCryptoTeams =
            itemView.findViewById<AccessCryptoTeams>(R.id.listAccessCryptoTeams)
    }
}