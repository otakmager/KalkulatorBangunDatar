package com.otakmager.kalkulatorbangundatar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.otakmager.kalkulatorbangundatar.databinding.FragmentKelilingBinding
import com.otakmager.kalkulatorbangundatar.keliling.*

class KelilingFragment : Fragment() {
    private lateinit var binding: FragmentKelilingBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding = FragmentKelilingBinding.inflate(layoutInflater)
        return binding.root
    }

    // Transisi
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Persegi
        binding.menukelpersegi.setOnClickListener {
            val i = Intent(this@KelilingFragment.requireContext(), KelilingPersegi::class.java)
            startActivity(i)
        }

        // Persegi Panjang
        binding.menukelpersegipanjang.setOnClickListener {
            val i = Intent(this@KelilingFragment.requireContext(), KelilingPersegiPanjang::class.java)
            startActivity(i)
        }

        // Trapesium
        binding.menukeltrap.setOnClickListener {
            val i = Intent(this@KelilingFragment.requireContext(), KelilingTrapesium::class.java)
            startActivity(i)
        }

        // Jajargenjang
        binding.menukeljajar.setOnClickListener {
            val i = Intent(this@KelilingFragment.requireContext(), KelilingJajargenjang::class.java)
            startActivity(i)
        }

        // Lingkaran
        binding.menukellingkaran.setOnClickListener {
            val i = Intent(this@KelilingFragment.requireContext(), KelilingLingkaran::class.java)
            startActivity(i)
        }

        // Layang-Layang
        binding.menukellayang.setOnClickListener {
            val i = Intent(this@KelilingFragment.requireContext(), KelilingLayangLayang::class.java)
            startActivity(i)
        }

        // Segitiga
        binding.menukelsegitiga.setOnClickListener {
            val i = Intent(this@KelilingFragment.requireContext(), KelilingSegitiga::class.java)
            startActivity(i)
        }

        // Belah Ketupat
        binding.menukelbelahktp.setOnClickListener {
            val i = Intent(this@KelilingFragment.requireContext(), KelilingBelahKetupat::class.java)
            startActivity(i)
        }

    }

}