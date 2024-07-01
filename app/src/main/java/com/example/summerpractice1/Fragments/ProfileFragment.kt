package com.example.summerpractice1.Fragments

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.summerpractice1.R
import com.example.summerpractice1.databinding.FragmentProfileBinding
import com.google.android.material.snackbar.Snackbar

class ProfileFragment : Fragment(R.layout.fragment_profile) {
    private var binding: FragmentProfileBinding? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentProfileBinding.bind(view)
        viewButton()

    }

    fun viewButton() {
        binding?.run {
            this.button.setOnClickListener {
                if (this.textEt.text.toString() != "") findNavController().navigate(R.id.navigation_main)
                else {
                    Snackbar.make(it, "Для отправки текста требуется заполнить поле", Snackbar.LENGTH_SHORT).setTextColor(Color.RED).show()
                }
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}