package com.example.rinat_kasymov_3_6

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.rinat_kasymov_3_6.databinding.AlbumItemBinding

class AlbumAdapter : RecyclerView.Adapter<AlbumAdapter.AlbumHolder>() {
    val albumList = ArrayList<Album>()

    class AlbumHolder(item: View): RecyclerView.ViewHolder(item){
        val binding = AlbumItemBinding.bind(item)
       fun bind(album: Album) = with(binding){
          im.setImageResource(album.imageId)
           tvTitle.text = album.title
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.album_item, parent, false)
        return AlbumHolder(view)
    }

    override fun getItemCount(): Int {
       return albumList.size
    }

    override fun onBindViewHolder(holder: AlbumHolder, position: Int) {
    holder.bind(albumList[position])
    }
    fun addAlbum(album: Album){
        albumList.add(album)
        notifyDataSetChanged()
    }

}