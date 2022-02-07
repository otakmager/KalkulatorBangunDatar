package com.otakmager.kalkulatorbangundatar.luas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityLuasSegitigaBinding

class LuasSegitiga : AppCompatActivity() {
    private lateinit var binding: ActivityLuasSegitigaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLuasSegitigaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Back to MainActivity
        val actionBar = supportActionBar
        actionBar!!.title = ""
        actionBar.setDisplayHomeAsUpEnabled(true)

        // Calculator
        binding.tombolhitung.setOnClickListener {
            val a = binding.inputA.text
            val t = binding.inputT.text

            if (a.isNullOrBlank()){
                binding.inputA.error = "a tidak boleh kosong"
                binding.inputA.requestFocus()
            }
            else if (t.isNullOrBlank()){
                binding.inputT.error = "t tidak boleh kosong"
                binding.inputT.requestFocus()
            }
            else{
                calculate(a.toString().toLong(), t.toString().toLong())
            }
        }

    }

    @SuppressLint("SetTextI18n")
    fun calculate(a:Long, t:Long){
        val result = 0.5 * a * t
        binding.tekshasil.text = "Hasil = $result"
    }
}