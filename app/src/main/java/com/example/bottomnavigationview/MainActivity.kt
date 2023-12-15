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
        setContentView(binding.root)

        val navHost = supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment
        val navController = navHost.navController

        binding.bottomNavigationView.setupWithNavController(navController)

        binding.bottomNavigationView.setOnItemSelectedListener { item ->
            val colorResId = when (item.itemId) {
                R.id.firsttFragment -> R.color.selected_color
                R.id.secondFragment -> R.color.selected_color2
                R.id.thirdFragment -> R.color.selected_color3
                R.id.fourthFragment -> R.color.selected_color
                else -> R.color.unselected_color
            }

            binding.bottomNavigationView.setBackgroundColor(resources.getColor(colorResId, null))

            // Fragment değişiklikleri
            when (item.itemId) {
                R.id.firsttFragment, R.id.secondFragment, R.id.thirdFragment, R.id.fourthFragment -> {
                    navController.navigate(item.itemId)
                }
            }

            true
        }
    }
}