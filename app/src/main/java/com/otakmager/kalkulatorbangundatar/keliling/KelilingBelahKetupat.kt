package com.otakmager.kalkulatorbangundatar.keliling

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityKelilingBelahKetupatBinding

class KelilingBelahKetupat : AppCompatActivity() {
    private lateinit var binding: ActivityKelilingBelahKetupatBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKelilingBelahKetupatBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Calculator
        binding.tombolhitung.setOnClickListener {
            val abcd = binding.inputABCD.text

            if (abcd.isNullOrBlank()){
                binding.inputABCD.error = "sisi tidak boleh kosong"
                binding.inputABCD.requestFocus()
            }
            else{
                calculate(abcd.toString().toLong())
            }
        }

    }

    @SuppressLint("SetTextI18n")
    fun calculate(s:Long){
        val result = 4 * s
        binding.tekshasil.text = "Hasil = $result"
    }
}