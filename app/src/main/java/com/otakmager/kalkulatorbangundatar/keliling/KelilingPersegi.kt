package com.otakmager.kalkulatorbangundatar.keliling

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityKelilingPersegiBinding

class KelilingPersegi : AppCompatActivity() {
    private lateinit var binding: ActivityKelilingPersegiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKelilingPersegiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Back to MainActivity
        val actionBar = supportActionBar
        actionBar!!.title = ""
        actionBar.setDisplayHomeAsUpEnabled(true)

        // Calculator
        binding.tombolhitung.setOnClickListener {
            val s = binding.inputSisiLuasPersegi.text

            if (s.isNullOrBlank()){
                binding.inputSisiLuasPersegi.error = "sisi tidak boleh kosong"
                binding.inputSisiLuasPersegi.requestFocus()
            }
            else{
                calculate(s.toString().toLong())
            }
        }

    }

    @SuppressLint("SetTextI18n")
    fun calculate(s:Long){
        val result = 4 * s
        binding.tekshasil.text = "Hasil = $result"
    }
}