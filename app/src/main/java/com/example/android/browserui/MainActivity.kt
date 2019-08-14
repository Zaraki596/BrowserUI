package com.example.android.browserui

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
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
import kotlinx.android.synthetic.main.tab_view.*


class MainActivity : AppCompatActivity() {


    private val names: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browstb = findViewById<Toolbar>(R.id.browser_tb)


        //Testing Items
        addName()

        rv_test.layoutManager = LinearLayoutManager(this)
        rv_test.adapter = TestAdapter(names, this)

        /*
        Setting Icon tint null to have the original color of the icon
         */
        browser_bottom_nav_view.itemIconTintList = null
        tab_bottom_nav_view?.itemIconTintList = null

        /*
        Bottom Navigation Item selected items
         */
        browser_bottom_nav_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_nav_search -> {
                    Toast.makeText(this, "Search Tapped", Toast.LENGTH_SHORT).show()
                    showDialogPopUp()
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
                    val popupMenu = PopupMenu(this, browser_bottom_nav_view, Gravity.END)
                    popupMenu.inflate(R.menu.browser_menu)
                    popupMenu.setOnMenuItemClickListener {
                        when (it?.itemId) {
                            R.id.menu_new_tab -> {
                                true
                            }
                            R.id.menu_new_private_tab -> {
                                true
                            }
                            R.id.menu_offline_pgs -> {
                                true
                            }
                            R.id.menu_history -> {
                                true
                            }
                            R.id.menu_find_page -> {
                                true
                            }
                            R.id.menu_desktop_site -> {
                                true
                            }
                            R.id.menu_default_browser -> {
                                true
                            }
                            R.id.menu_back_play -> {
                                true
                            }
                            R.id.menu_night_mode -> {
                                true
                            }
                            R.id.menu_help -> {
                                true
                            }
                            R.id.menu_share -> {
                                true
                            }
                            R.id.menu_music -> {
                                true
                            }
                            R.id.menu_downloads -> {
                                true
                            }
                            R.id.menu_settings -> {
                                true
                            }
                            else -> {
                                false
                            }
                        }
                        popupMenu.show()

                        true
                    }
                    popupMenu.show()
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

    /*
      * Pop Dialog feature - which was not implemented*/
    private fun showDialogPopUp() {
        val dialog = Dialog(this)
        dialog.setCancelable(true)
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
        val window = dialog.window
        window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
        dialog.setContentView(R.layout.popup_menu_dialog_view)
        val cardLayout: CardView = dialog.findViewById(R.id.popup_menu_card)
        val parameter: ConstraintLayout.LayoutParams = cardLayout.layoutParams as ConstraintLayout.LayoutParams
        parameter.setMargins(16, 16, 16, 200)
        val wlp = window?.attributes
        wlp?.gravity = Gravity.BOTTOM
        window?.attributes = wlp
        window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
        dialog.show()
    }

        /*
    * Showing Pop Up menu on options tap*/

        fun addName() {
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










