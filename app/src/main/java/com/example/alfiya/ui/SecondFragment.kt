package com.example.alfiya.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alfiya.R
import com.example.alfiya.databinding.FragmentSecondBinding

class SecondFragment: Fragment(R.layout.fragment_second) {

    private lateinit var binding: FragmentSecondBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSecondBinding.bind(view)
        binding.apply {
            findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)
        }
    }
}