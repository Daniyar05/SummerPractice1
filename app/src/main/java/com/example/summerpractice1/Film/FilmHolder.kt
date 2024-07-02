package com.example.summerpractice1.Film


import android.content.Context
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.RequestManager
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
import com.example.summerpractice1.databinding.ItemFilmBinding

class FilmHolder(
    private val binding: ItemFilmBinding,
    private val glide: RequestManager,
    private val onClick: (Film) -> Unit,
) : ViewHolder(binding.root) {
    private val requestOptions = RequestOptions
        .diskCacheStrategyOf(
            DiskCacheStrategy.ALL
        )

    private val context: Context
        get() = itemView.context

    fun onBind(film: Film) {
        binding.run {
            tvName.text = film.name
            tvShortInfo.text = film.shortInfo
//            tvLongInfo.text = film.longInfo

            glide
                .load(film.url)
                .apply(requestOptions)
                .into(ivImage)

            root.setOnClickListener {
                onClick.invoke(film)
            }
        }
    }

}