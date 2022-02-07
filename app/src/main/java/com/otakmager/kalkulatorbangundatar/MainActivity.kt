package com.otakmager.kalkulatorbangundatar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.otakmager.kalkulatorbangundatar.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // view Binding
    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // view Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // No Action Bar
        supportActionBar?.hide()

        // Variable
        val viewPager = binding.viewPager
        val tablayout = binding.tabLayout
        val adapter = ViewPageAdapter(supportFragmentManager, lifecycle)

        // Use Adapter
        viewPager.adapter = adapter
        TabLayoutMediator(tablayout, viewPager){tab, position ->
            when(position){
                0 -> {
                    tab.text = "Luas"
                }
                1 -> {
                    tab.text = "Keliling"
                }
            }
        }.attach()
    }
}