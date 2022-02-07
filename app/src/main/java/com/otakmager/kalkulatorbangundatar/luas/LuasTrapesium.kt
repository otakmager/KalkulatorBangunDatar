package com.otakmager.kalkulatorbangundatar.luas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityLuasTrapesiumBinding

class LuasTrapesium : AppCompatActivity() {
    private lateinit var binding: ActivityLuasTrapesiumBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLuasTrapesiumBinding.inflate(layoutInflater)
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
            val t = binding.inputT.text

            if (a.isNullOrBlank()){
                binding.inputa.error = "a tidak boleh kosong"
                binding.inputa.requestFocus()
            }
            else if (b.isNullOrBlank()){
                binding.inputb.error = "b tidak boleh kosong"
                binding.inputb.requestFocus()
            }
            else if (t.isNullOrBlank()){
                binding.inputT.error = "t tidak boleh kosong"
            }
            else{
                calculate(a.toString().toLong(), b.toString().toLong(), t.toString().toLong())
            }
        }
    }

    @SuppressLint("SetTextI18n")
    fun calculate(a:Long, b:Long, t:Long){
        val result = ((a+b)/2) * t
        binding.tekshasil.text = "Hasil = $result"
    }
}