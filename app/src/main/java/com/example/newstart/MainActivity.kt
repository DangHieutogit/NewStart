package com.example.newstart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
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
                inflateFragment(GuardFragment.newInstance())
            } else if(menuItem.itemId == R.id.nav_home){
                inflateFragment(HomeFragment.newInstance())
            }
            true
        }

   }



    // thay doi man
    private fun inflateFragment(newInstance: Fragment) {

        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.container, newInstance)
        transaction.commit()
    }
}