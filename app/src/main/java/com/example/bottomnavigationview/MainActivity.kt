package com.example.bottomnavigationview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.bottomnavigationview.databinding.ActivityMainBinding
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
23

     val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHost.navController
        //val bottomNav : BottomNavigationView =  binding.bottomNavigationView
        // ActionBar'ı NavController ile bağla
       // bottomNav.setupWithNavController(navController)

        // BottomNavigationView'ı NavController ile bağla
     binding.bottomNavigationView.setupWithNavController(navController)
        setContentView(binding.root)
    }
}