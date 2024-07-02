package com.example.summerpractice1.Fragments


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import com.example.summerpractice1.R
import com.example.summerpractice1.databinding.FragmentHomeBinding

class HomeFragment : Fragment(R.layout.fragment_home) {

    private var binding: FragmentHomeBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentHomeBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}