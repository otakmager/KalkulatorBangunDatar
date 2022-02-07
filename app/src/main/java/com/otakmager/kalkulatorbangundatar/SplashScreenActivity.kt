package com.otakmager.kalkulatorbangundatar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.os.Handler
import com.otakmager.kalkulatorbangundatar.databinding.ActivitySplashScreenBinding

class SplashScreenActivity : AppCompatActivity() {

    // view Binding
    private lateinit var binding : ActivitySplashScreenBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        // view Binding
        binding = ActivitySplashScreenBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Variable
        val tempatlogo = binding.tempatlogo

        // No Action Bar
        supportActionBar?.hide()

        // Trantition to Main Activit with Animation
        tempatlogo.alpha = 0f
        tempatlogo.animate().setDuration(3000).alpha(1f).withEndAction{
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
            finish()
        }


    }
}