package com.otakmager.kalkulatorbangundatar.keliling

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.otakmager.kalkulatorbangundatar.databinding.ActivityKelilingPersegiPanjangBinding

class KelilingPersegiPanjang : AppCompatActivity() {
    private lateinit var binding: ActivityKelilingPersegiPanjangBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKelilingPersegiPanjangBinding.inflate(layoutInflater)
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
                binding.inputPanjang.error = "p tidak boleh kosong"
                binding.inputPanjang.requestFocus()
            }
            else if (l.isNullOrBlank()){
                binding.inputLebar.error = "l tidak boleh kosong"
                binding.inputLebar.requestFocus()
            }
            else{
                calculate(p.toString().toLong(), l.toString().toLong())
            }
        }

    }

    @SuppressLint("SetTextI18n")
    fun calculate(p:Long, l:Long){
        val result = 2 * (p+l)
        binding.tekshasil.text = "Hasil = $result"
    }
}