package com.example.navigationtutorial

import android.databinding.DataBindingUtil
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.example.navigationtutorial.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var navController: NavController
    lateinit var navHostFragment: NavHostFragment
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        //NavHostFragment needs to be updated with a new nav_graph when you have more than 1 graphs
        navHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        //This will make our navController accessable from any fragment where we have a reference to mainActivity
        navController = navHostFragment.navController
        //Set up the bottom navigation bar using the line below
        NavigationUI.setupWithNavController(binding.mainBottomNavigation, navHostFragment.navController)
    }

}
