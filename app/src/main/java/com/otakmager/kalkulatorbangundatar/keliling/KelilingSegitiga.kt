package com.otakmager.kalkulatorbangundatar.keliling

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityKelilingSegitigaBinding

class KelilingSegitiga : AppCompatActivity() {
    private lateinit var binding: ActivityKelilingSegitigaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKelilingSegitigaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Back to MainActivity
        val actionBar = supportActionBar
        actionBar!!.title = ""
        actionBar.setDisplayHomeAsUpEnabled(true)

        // Calculator
        binding.tombolhitung.setOnClickListener {
            val a = binding.inputa.text
            val b = binding.inputb.text
            val c = binding.inputC.text

            if (a.isNullOrBlank()){
                binding.inputa.error = "a tidak boleh kosong"
                binding.inputa.requestFocus()
            }
            else if (b.isNullOrBlank()){
                binding.inputb.error = "b tidak boleh kosong"
                binding.inputb.requestFocus()
            }
            else if (c.isNullOrBlank()){
                binding.inputC.error = "c tidak boleh kosong"
                binding.inputC.requestFocus()
            }
            else{
                calculate(a.toString().toLong(), b.toString().toLong(), c.toString().toLong())
            }
        }

    }

    @SuppressLint("SetTextI18n")
    fun calculate(a:Long, b:Long, c:Long){
        val result = a + b + c
        binding.tekshasil.text = "Hasil = $result"
    }
}