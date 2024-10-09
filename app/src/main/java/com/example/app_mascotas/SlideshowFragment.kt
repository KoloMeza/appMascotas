package com.example.app_mascotas

import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.VideoView
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class SlideshowFragment : Fragment() {

    private lateinit var videoView: VideoView
    private lateinit var playButton: Button
    private lateinit var recyclerView: RecyclerView

    private val videoUrls = listOf(
        "android.resource://com.example.app_mascotas/" + R.raw.video1,
        "android.resource://com.example.app_mascotas/" + R.raw.video2)


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_slideshow, container, false)

        videoView = view.findViewById(R.id.video_view)
        playButton = view.findViewById(R.id.play_button)
        recyclerView = view.findViewById(R.id.recycler_view_videos)

        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        val adapter = VideoAdapter(videoUrls) { videoUrl ->
            videoView.setVideoURI(Uri.parse(videoUrl))
        }
        recyclerView.adapter = adapter

        playButton.setOnClickListener {
            videoView.start()
        }

        return view
    }
}
