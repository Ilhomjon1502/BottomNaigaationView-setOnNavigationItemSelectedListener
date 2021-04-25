package com.ilhomjon.bottomnavigationview

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottom_navigate_view.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_1 -> container.setBackgroundColor(Color.RED)
                R.id.menu_2 -> container.setBackgroundColor(Color.BLUE)
                R.id.menu_3 -> container.setBackgroundColor(Color.CYAN)
                R.id.menu_4 -> container.setBackgroundColor(Color.GREEN)
            }
            true
        }
    }
}