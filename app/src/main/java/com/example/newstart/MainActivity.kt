package com.example.newstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_activity)

        val bottomBar = findViewById<BottomNavigationView>(R.id.bottom_nav)

        bottomBar.setOnItemSelectedListener {menuItem ->
            //su dung nhu nay se kiem soat duoc sau khi click
            // vao item guard se dc chuyen man hinh
            if(menuItem.itemId==R.id.nav_guard){
                inflateFragment()
            } else if(menuItem.itemId == R.id.nav_home){
                inflateHomeFragment()
            }
            true
        }

   }

    private fun inflateHomeFragment() {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, HomeFragment.newInstance())
        transaction.commit()
    }

    // thay doi man
    private fun inflateFragment() {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, GuardFragment.newInstance())
        transaction.commit()
    }
}