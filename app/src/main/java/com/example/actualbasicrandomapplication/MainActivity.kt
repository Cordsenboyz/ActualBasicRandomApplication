package com.example.actualbasicrandomapplication

import android.R
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.actualbasicrandomapplication.R.layout.activity_main)
        //Initialize the bottom navigation view
        //create bottom navigation view object
        val bottomNavigationView = findViewById<BottomNavigationView>(com.example.actualbasicrandomapplication.R.id.bottom_navigatin_view)
        val navController = findNavController(com.example.actualbasicrandomapplication.R.id.nav_fragment)
        bottomNavigationView.setupWithNavController(navController
        )
    }
}