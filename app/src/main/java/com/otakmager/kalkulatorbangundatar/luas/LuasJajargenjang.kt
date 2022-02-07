package com.otakmager.kalkulatorbangundatar.luas

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityLuasJajargenjangBinding

class LuasJajargenjang : AppCompatActivity() {
    private lateinit var binding: ActivityLuasJajargenjangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLuasJajargenjangBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        // Back to MainActivity
        val actionBar = supportActionBar
        actionBar!!.title = ""
        actionBar.setDisplayHomeAsUpEnabled(true)

        // Calculator
        val a = binding.inputA.text
        val t = binding.inputT.text

        if (a.isNullOrBlank()){
            binding.inputA.error = "a tidak boleh kosong"
            binding.inputA.requestFocus()
        }
        else if (t.isNullOrBlank()){
            binding.inputT.error = "b tidak boleh kosong"
            binding.inputT.requestFocus()
        }
        else{
            calculate(a.toString().toLong(), t.toString().toLong())
        }
    }

    @SuppressLint("SetTextI18n")
    fun calculate(a:Long, t:Long){
        val result = a*t
        binding.tekshasil.text = "Hasil = $result"
    }
}