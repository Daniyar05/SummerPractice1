package com.example.summerpractice1.Fragments


import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.bumptech.glide.Glide
import com.example.summerpractice1.Film.FilmAdapter
import com.example.summerpractice1.Film.FilmRepository
import com.example.summerpractice1.R
import com.example.summerpractice1.databinding.FragmentDashboardBinding

class DashboardFragment : Fragment(R.layout.fragment_dashboard) {

    private var binding: FragmentDashboardBinding? = null
    private var adapter: FilmAdapter? = null
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentDashboardBinding.bind(view)
        initAdapter()
    }

    private fun initAdapter() {
        binding?.run {
            adapter = FilmAdapter(
                list = FilmRepository.films,
                glide = Glide.with(this@DashboardFragment),
                onClick = {

                    findNavController().navigate(
                        R.id.navigation_film,
                        args = FilmFragment.bundle(id = it.id)
                    )

                }
            )

            rvFilm.adapter = adapter
            rvFilm.layoutManager =
                LinearLayoutManager(requireContext(), LinearLayoutManager.HORIZONTAL, false)

            tvTitle.setOnClickListener {
                adapter?.updateDataset(FilmRepository.films)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}