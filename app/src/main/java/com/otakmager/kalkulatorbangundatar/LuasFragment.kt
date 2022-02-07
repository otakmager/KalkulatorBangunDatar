package com.otakmager.kalkulatorbangundatar

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.otakmager.kalkulatorbangundatar.databinding.FragmentLuasBinding
import com.otakmager.kalkulatorbangundatar.luas.*

class LuasFragment : Fragment(R.layout.fragment_luas) {

    private var _binding: FragmentLuasBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentLuasBinding.inflate(inflater, container, false)
        return binding.root
    }

    // Transisi ke tiap calculator
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // Persegi
        binding.menuluaspersegi.setOnClickListener {
            val i = Intent(this@LuasFragment.requireContext(), LuasPersegi::class.java)
            startActivity(i)
        }

        // Persegi Panjang
        binding.menuluaspersegipanjang.setOnClickListener {
            val i = Intent(this@LuasFragment.requireContext(), LuasPersegiPanjang::class.java)
            startActivity(i)
        }

        // Trapesium
        binding.menuluastrap.setOnClickListener {
            val i = Intent(this@LuasFragment.requireContext(), LuasTrapesium::class.java)
            startActivity(i)
        }

        // Jajargenjang
        binding.menuluasjajar.setOnClickListener {
            val i = Intent(this@LuasFragment.requireContext(), LuasJajargenjang::class.java)
            startActivity(i)
        }

        // Lingkaran
        binding.menuluaslingkaran.setOnClickListener {
            val i = Intent(this@LuasFragment.requireContext(), LuasLingkaran::class.java)
            startActivity(i)
        }

        // Layang-Layang
        binding.menuluaslayang.setOnClickListener {
            val i = Intent(this@LuasFragment.requireContext(), LuasLayangLayang::class.java)
            startActivity(i)
        }

        // Segitiga
        binding.menuluassegitiga.setOnClickListener {
            val i = Intent(this@LuasFragment.requireContext(), LuasSegitiga::class.java)
            startActivity(i)
        }

        // Belah Ketupat
        binding.menuluasbelahktp.setOnClickListener {
            val i = Intent(this@LuasFragment.requireContext(), LuasBelahKetupat::class.java)
            startActivity(i)
        }

    }

    // To Avoid Memory Leaks
    override fun onDestroy() {
        super.onDestroy()
       _binding = null
    }

}