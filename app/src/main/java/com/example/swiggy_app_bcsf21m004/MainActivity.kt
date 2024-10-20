package com.example.swiggy_app_bcsf21m004.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.swiggy_app_bcsf21m004.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNavigationView: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation_view)

        // Set default fragment (Swiggy/Home) when app starts
        loadFragment(HomeFragment())

        // Set listener for navigation item selection
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_swiggy -> {
                    loadFragment(HomeFragment()) // Swiggy (Home)
                    true
                }
                R.id.navigation_food -> {
                    // Food is unclickable, do nothing
                    true
                }
                R.id.navigation_instamart -> {
                    loadFragment(InstamartFragment()) // Instamart
                    true
                }
                R.id.navigation_dineout -> {
                    // Dineout is unclickable, do nothing
                    true
                }
                R.id.navigation_genie -> {
                    // Genie is unclickable, do nothing
                    true
                }
                else -> false
            }
        }
    }

    // Function to load fragments into the fragment container
    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container, fragment)
            .commit()
    }
}
