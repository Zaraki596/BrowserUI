package com.example.android.browserui

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.MenuItem
import android.view.Window
import android.widget.LinearLayout
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.tab_view.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val browstb = findViewById<Toolbar>(R.id.browser_tb)

        browstb.inflateMenu(R.menu.browser_menu)
        browstb.setNavigationIcon(R.drawable.ic_back)



        browser_bottom_nav_view.itemIconTintList = null
        tab_bottom_nav_view?.itemIconTintList = null

        browser_bottom_nav_view.getOrCreateBadge(R.id.bottom_nav_tabs)?.number = 3


        browser_bottom_nav_view.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.bottom_nav_menu -> {

                    Log.d("Check issue", "Reached Here")
                    Toast.makeText(this, "Menu Tapped", Toast.LENGTH_SHORT).show()

                    val dialog = Dialog(this)
                    dialog.setCancelable(true)
                    dialog.requestWindowFeature(Window.FEATURE_NO_TITLE)
                    val window = dialog.window
                    window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
                    dialog.setContentView(R.layout.popup_menu_dialog_view);
                    val wlp = window?.attributes
                   // val params = window as LinearLayout.LayoutParams
                    wlp?.gravity = Gravity.BOTTOM
                    wlp?.verticalMargin = 0.06f
                    window?.attributes = wlp
                    window?.setLayout(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT)
                    dialog.show()

                    true

                }
                R.id.bottom_nav_fav ->{
                    Toast.makeText(this, "Favorites Tapped", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.bottom_nav_notepad ->{
                    Toast.makeText(this, "Notepad Tapped", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.bottom_nav_tap ->{
                    Toast.makeText(this, "Tap Tapped", Toast.LENGTH_SHORT).show()
                    true
                }
                R.id.bottom_nav_tabs ->{
                    Toast.makeText(this, "Tabs Tapped", Toast.LENGTH_SHORT).show()
                    true
                }

                else -> false
            }
        }
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {

            R.id.menu_new_tab -> {
                true
            }
            R.id.menu_new_private_tab -> {
                true
            }
            R.id.menu_new_recent_tab -> {
                true
            }
            R.id.menu_duplicate -> {
                true
            }
            R.id.menu_find_page -> {
                true
            }
            R.id.menu_magdocs -> {
                true
            }
            R.id.menu_saves -> {
                true
            }
            R.id.menu_notepad -> {
                true
            }
            R.id.menu_downloads -> {
                true
            }
            R.id.menu_desktop_site -> {
                if (item.isChecked()) {
                    // If item already checked then unchecked it
                    item.setChecked(false);
                } else {
                    // If item is unchecked then checked it
                    item.setChecked(true);
                }

            }
            R.id.menu_def_browser -> {
                true
            }
            R.id.menu_back_play -> {
                if (item.isChecked()) {
                    // If item already checked then unchecked it
                    item.setChecked(false);
                } else {
                    // If item is unchecked then checked it
                    item.setChecked(true);
                }

            }
            R.id.menu_settings -> {
                true
            }
            R.id.menu_night_mode -> {
                true
            }
        }
        return super.onOptionsItemSelected(item)
    }
}
