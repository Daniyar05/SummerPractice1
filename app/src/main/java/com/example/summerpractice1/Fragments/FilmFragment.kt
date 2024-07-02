package com.example.summerpractice1.Fragments


import android.os.Bundle
import android.text.method.ScrollingMovementMethod
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.summerpractice1.Film.FilmRepository
import com.example.summerpractice1.R
import com.example.summerpractice1.databinding.FragmentFilmBinding

class FilmFragment : Fragment(R.layout.fragment_film) {

    private var binding: FragmentFilmBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentFilmBinding.bind(view)
        init()

    }

    private fun init() {
        binding?.run {
            val id = arguments?.getInt(ARG_ID)?.toInt()
            val thisFilm = FilmRepository.films.findLast { film -> film.id == id }
            tvName.text = thisFilm?.name
            tvShortInfo.text = thisFilm?.shortInfo
            tvLongInfo.text = thisFilm?.longInfo
            tvLongInfo.movementMethod = ScrollingMovementMethod()
            Glide.with(ivImage).load(thisFilm?.url)
                .apply(
                    RequestOptions
                        .diskCacheStrategyOf(
                            DiskCacheStrategy.ALL
                        )
                ).into(ivImage)
            imageBack.setOnClickListener {
                findNavController().navigateUp()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }

    companion object {
        private const val ARG_ID = "ARG_ID"
        fun bundle(id: Int): Bundle = Bundle().apply {
            putInt(ARG_ID, id)
        }
    }
}