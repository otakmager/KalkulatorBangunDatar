package com.otakmager.kalkulatorbangundatar.luas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityLuasPersegiPanjangBinding

class LuasPersegiPanjang : AppCompatActivity() {
    private lateinit var binding: ActivityLuasPersegiPanjangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLuasPersegiPanjangBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Back to MainActivity
        val actionBar = supportActionBar
        actionBar!!.title = ""
        actionBar.setDisplayHomeAsUpEnabled(true)

        // Calculator
        binding.tombolhitung.setOnClickListener {
            val p = binding.inputPanjang.text
            val l = binding.inputLebar.text

            if (p.isNullOrBlank()){
                binding.inputPanjang.error = "Panjang tidak boleh kosong"
                binding.inputPanjang.requestFocus()
            }
            else if (l.isNullOrBlank()){
                binding.inputLebar.error = "Lebar tidak boleh kosong"
                binding.inputLebar.requestFocus()
            }
            else{
                calculate(p.toString().toLong(), l.toString().toLong())
            }
        }
    }

    @SuppressLint("SetTextI18n")
    fun calculate(panjang:Long, lebar:Long){
        val result = panjang * lebar
        binding.tekshasil.text = "Hasil = $result"
    }
}