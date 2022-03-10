package com.example.alfiya.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alfiya.R
import com.example.alfiya.databinding.FragmentThirdBinding

class ThirdFragment: Fragment(R.layout.fragment_third) {

    private lateinit var binding: FragmentThirdBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentThirdBinding.bind(view)
        binding.apply {
            btnNext.setOnClickListener {
                findNavController().navigate(R.id.action_thirdFragment_to_mainFragment)
            }
        }
    }
}