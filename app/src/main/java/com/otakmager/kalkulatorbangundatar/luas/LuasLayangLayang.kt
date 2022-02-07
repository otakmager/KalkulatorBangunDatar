package com.otakmager.kalkulatorbangundatar.luas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityLuasLayangLayangBinding

class LuasLayangLayang : AppCompatActivity() {
    private lateinit var binding: ActivityLuasLayangLayangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLuasLayangLayangBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Back to MainActivity
        val actionBar = supportActionBar
        actionBar!!.title = ""
        actionBar.setDisplayHomeAsUpEnabled(true)

        // Calculator
        binding.tombolhitung.setOnClickListener {
            val d1 = binding.inputD1.text
            val d2 = binding.inputD2.text

            if (d1.isNullOrBlank()){
                binding.inputD1.error ="d1 tidak boleh kosong"
                binding.inputD1.requestFocus()
            }
            else if (d2.isNullOrBlank()){
                binding.inputD2.error = "d2 tidak boleh kosong"
                binding.inputD2.requestFocus()
            }
            else{
                calculate(d1.toString().toLong(), d2.toString().toLong())
            }
        }

    }

    @SuppressLint("SetTextI18n")
    fun calculate(d1:Long, d2:Long){
        val result = 0.5 * d1 * d2
        binding.tekshasil.text = "Hasil = $result"
    }
}