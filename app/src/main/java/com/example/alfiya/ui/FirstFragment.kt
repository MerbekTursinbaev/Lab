package com.example.alfiya.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.alfiya.R
import com.example.alfiya.databinding.FragmentFirstBinding

class FirstFragment: Fragment(R.layout.fragment_first) {

    private lateinit var binding: FragmentFirstBinding

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFirstBinding.bind(view)
        binding.apply {
            btnNext.setOnClickListener {
                findNavController().navigate(R.id.action_firstFragment_to_secondFragment)
            }
        }
    }
}