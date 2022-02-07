package com.otakmager.kalkulatorbangundatar.keliling

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityKelilingLayangLayangBinding

class KelilingLayangLayang : AppCompatActivity() {
    private lateinit var binding: ActivityKelilingLayangLayangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKelilingLayangLayangBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Back to MainActivity
        val actionBar = supportActionBar
        actionBar!!.title = ""
        actionBar.setDisplayHomeAsUpEnabled(true)

        // Calculator
        binding.tombolhitung.setOnClickListener {
            val ad = binding.inputAD.text
            val bc = binding.inputBC.text

            if (ad.isNullOrBlank()){
                binding.inputAD.error ="a atau d tidak boleh kosong"
                binding.inputAD.requestFocus()
            }
            else if (bc.isNullOrBlank()){
                binding.inputBC.error = "b atau c tidak boleh kosong"
                binding.inputBC.requestFocus()
            }
            else{
                calculate(ad.toString().toLong(), bc.toString().toLong())
            }
        }

    }

    @SuppressLint("SetTextI18n")
    fun calculate(ad:Long, bc:Long){
        val result = 2 * (ad + bc)
        binding.tekshasil.text = "Hasil = $result"
    }
}