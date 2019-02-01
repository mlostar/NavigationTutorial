package com.example.navigationtutorial;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.navigationtutorial.databinding.ActivityMainBinding;

import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

public class MainActivity extends AppCompatActivity {
    public NavController navController;
    public NavHostFragment navHostFragment;
    public ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        //NavHostFragment needs to be updated with a new nav_graph when you have more than 1 graphs
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        //This will make our navController accessable from any fragment where we have a reference to mainActivity
        navController = navHostFragment.getNavController();
        //Set up the bottom navigation bar using the line below
        NavigationUI.setupWithNavController(binding.mainBottomNavigation, navHostFragment.getNavController());
    }

}
