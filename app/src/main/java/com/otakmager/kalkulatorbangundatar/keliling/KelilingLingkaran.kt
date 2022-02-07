package com.otakmager.kalkulatorbangundatar.keliling

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityKelilingLingkaranBinding
import kotlin.math.PI

class KelilingLingkaran : AppCompatActivity() {
    private lateinit var binding: ActivityKelilingLingkaranBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKelilingLingkaranBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Back to MainActivity
        val actionBar = supportActionBar
        actionBar!!.title = ""
        actionBar.setDisplayHomeAsUpEnabled(true)

        // Calculator
        binding.tombolhitung.setOnClickListener {
            val r = binding.inputR.text

            if (r.isNullOrBlank()){
                binding.inputR.error = "r tidak boleh kosong"
                binding.inputR.requestFocus()
            }
            else{
                calculate(r.toString().toLong())
            }
        }
    }

    @SuppressLint("SetTextI18n")
    fun calculate(r:Long){
        val result = 2 * PI * r
        binding.tekshasil.text = "Hasil = $result"
    }
}