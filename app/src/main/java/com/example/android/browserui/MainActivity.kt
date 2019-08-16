package com.example.android.browserui

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.MenuInflater
import android.view.Window
import android.widget.LinearLayout
import android.widget.PopupMenu
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.history_view.*
import kotlinx.android.synthetic.main.tab_view.*
import java.util.zip.Inflater


class MainActivity : AppCompatActivity() {


    private val names: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browstb = findViewById<Toolbar>(R.id.browsing_tb)

        //Delete history popup option
        /*tv_delete_history.setOnClickListener {
            val popupMenu = PopupMenu(this, it)
            val inflater : MenuInflater = popupMenu.menuInflater
            inflater.inflate(R.menu.delete_history_menu, popupMenu.menu)
            popupMenu.show()

        }*/


        //Testing Items
        addItems()

        rv_test.layoutManager = LinearLayoutManager(this)
        rv_test.adapter = TestAdapter(names, this)


        //Setting Icon tint null to have the original color of the icon

        browser_bottom_nav_view.itemIconTintList = null
        tab_bottom_nav_view?.itemIconTintList = null


        //Bottom Navigation Item selected item options


        browser_bottom_nav_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_nav_search -> {
                    Toast.makeText(this, "Search Tapped", Toast.LENGTH_SHORT).show()
                    true

                }
                R.id.bottom_nav_fav -> {
                    Toast.makeText(this, "Favorites Tapped", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.bottom_nav_home -> {
                    Toast.makeText(this, "Home Tapped", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.bottom_nav_options -> {
                    Toast.makeText(this, "Options Tapped", Toast.LENGTH_SHORT).show()
                    showDialogPopUp()
                    true
                }

                    R.id.bottom_nav_tabs -> {
                        Toast.makeText(this, "Tabs Tapped", Toast.LENGTH_SHORT).show()
                        true
                    }

                    else -> false
                }
            }
        }


    // Pop Dialog Menu for the whole browser settings
    private fun showDialogPopUp() {
        val dialog = Dialog(this)
        dialog.setCancelable(true)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        val window = dialog.window
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.popup_menu_dialog_view)
        val cardLayout: CardView = dialog.findViewById(R.id.popup_menu_card)
        val parameter: ConstraintLayout.LayoutParams = cardLayout.layoutParams as ConstraintLayout.LayoutParams
        val wlp = window?.attributes
        wlp?.gravity = Gravity.BOTTOM
        window?.attributes = wlp
        window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        dialog.show()
    }


        fun addItems() {
            names.add("dog")
            names.add("cat")
            names.add("owl")
            names.add("cheetah")
            names.add("raccoon")
            names.add("bird")
            names.add("snake")
            names.add("lizard")
            names.add("hamster")
            names.add("bear")
            names.add("lion")
            names.add("tiger")
            names.add("horse")
            names.add("frog")
            names.add("fish")
            names.add("shark")
            names.add("turtle")
            names.add("elephant")
            names.add("cow")
            names.add("beaver")
            names.add("bison")
            names.add("porcupine")
            names.add("rat")
            names.add("mouse")
            names.add("goose")
            names.add("deer")
            names.add("fox")
            names.add("moose")
            names.add("buffalo")
            names.add("monkey")
            names.add("penguin")
            names.add("parrot")
        }
    }










