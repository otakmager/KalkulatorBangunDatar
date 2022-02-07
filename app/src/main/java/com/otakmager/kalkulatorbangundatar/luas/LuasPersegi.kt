package com.otakmager.kalkulatorbangundatar.luas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityLuasPersegiBinding

class LuasPersegi : AppCompatActivity() {
    private lateinit var binding : ActivityLuasPersegiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =  ActivityLuasPersegiBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Back to MainActivity
        val actionBar = supportActionBar
        actionBar!!.title = ""
        actionBar.setDisplayHomeAsUpEnabled(true)

        // Calculator
        binding.tombolhitung.setOnClickListener {
            val sisi = binding.inputSisiLuasPersegi.text

            if (sisi.isNullOrBlank()){
                binding.inputSisiLuasPersegi.error = "Sisi tidak boleh kosong"
                binding.inputSisiLuasPersegi.requestFocus()
            }
            else{
                calculate(sisi.toString().toLong())
            }
        }
    }

    @SuppressLint("SetTextI18n")
    fun calculate(s: Long) {
        val result = s*s
        binding.tekshasil.text = "Hasil = $result"
    }
}