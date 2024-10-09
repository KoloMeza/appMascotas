package com.example.app_mascotas

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.app_mascotas.R

class VideoAdapter(
    private val videoUrls: List<String>,
    private val onVideoSelected: (String) -> Unit
) : RecyclerView.Adapter<VideoAdapter.VideoViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_video, parent, false)
        return VideoViewHolder(view)
    }

    override fun onBindViewHolder(holder: VideoViewHolder, position: Int) {
        val videoUrl = videoUrls[position]
        // Aquí puedes cargar miniaturas de videos si las tienes
        holder.videoThumbnail.setImageResource(R.drawable.video_placeholder)

        holder.itemView.setOnClickListener {
            onVideoSelected(videoUrl)
        }
    }

    override fun getItemCount(): Int = videoUrls.size

    class VideoViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val videoThumbnail: ImageView = view.findViewById(R.id.video_thumbnail)
    }
}
