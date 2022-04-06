package com.studying.cryptobankapp

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.MaterialToolbar
import com.studying.cryptobankapp.cryptoHome.CryptoCoinsAdapter.CryptoCoin
import com.studying.cryptobankapp.cryptoHome.setUpRecyclerView
import com.studying.cryptobankapp.databinding.ActivityHomeScreenCryptoBankBinding
import com.studying.cryptobankapp.utils.customview.lists.cryptoCoinsCollection

class HomeScreenCryptoBankActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeScreenCryptoBankBinding
    private lateinit var dialog: AlertDialog

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeScreenCryptoBankBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView(myCoinsList())
        showDialogBinding()
        setFavoritesFilter()
        setAllFilter()

    }


    private fun showDialogBinding() {
        with(binding.toolbar) {
            setMenuHome()
            menuGoBackItem().setOnMenuItemClickListener {
                showAlertDialog()
                false
            }
        }
    }



    private fun showAlertDialog() {
        val build = AlertDialog.Builder(this, R.style.ThemeMyDialog)
        val view = layoutInflater.inflate(R.layout.custom_alert_dialog, null)
        build.setView(view)

        val btnCancel = setButton(view, (R.id.cancelButton))
        btnCancel.setOnClickListener { dialog.dismiss() }

        val leaveButton = setButton(view, (R.id.leaveButton))
        leaveButton.setOnClickListener {
            finish()
        }

        dialog = build.create()
        dialog.show()
    }



    private fun initRecyclerView(list: List<CryptoCoin>) {
        val cryptoList: MutableList<CryptoCoin> = mutableListOf()
        cryptoList.addAll(list)
        setUpRecyclerView(binding, cryptoList)
    }

    private fun myCoinsList(): List<CryptoCoin> {
        return if (cryptoCoinsCollection.any { it.favorite }) { // i need to change the lists
            cryptoCoinsCollection.filter { it.favorite }
        } else {
            cryptoCoinsCollection
        }
    }

    private fun setFavoritesFilter() {
        binding.run {
            onlyFavoriteButton.setOnClickListener {
                initRecyclerView(myCoinsList())
            }
        }
    }

    private fun setAllFilter() {
        binding.run {
            allButton.setOnClickListener {
                initRecyclerView(cryptoCoinsCollection)
            }
        }
    }
    private fun setButton(view: View, button: Int) = view.findViewById<Button>(button)

    private fun MaterialToolbar.menuGoBackItem() =
        menu.findItem(R.id.action_go_back)

    private fun MaterialToolbar.setMenuHome() {
        this.inflateMenu(R.menu.crypto_menu)
    }
}