package com.example.swiggy_app_bcsf21m004

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home)

        // Setup bottom navigation
        val bottomNavigation: BottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.navigation_swiggy -> {
                    // Handle home navigation
                    // Load the home fragment or perform other actions
                    true
                }
                R.id.navigation_dineout -> {
                    // Handle favorites navigation
                    // Load the favorites fragment or perform other actions
                    true
                }
                R.id.navigation_instamart -> {
                    // Handle profile navigation
                    // Load the profile fragment or perform other actions
                    true
                }
                else -> false
            }
        }

        // Load default fragment or any other setup
        if (savedInstanceState == null) {
            // Load your initial fragment here, e.g., loadHomeFragment()
        }
    }
}
