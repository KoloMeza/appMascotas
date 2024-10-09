package com.example.app_mascotas

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class VideosActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private lateinit var playButton: Button
    private lateinit var recyclerView: RecyclerView

    // Lista de URLs de videos
    private val videoUrls = listOf(
        "android.resource://com.example.app_mascotas/" + R.raw.video1,
        "android.resource://com.example.app_mascotas/" + R.raw.video2,
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)

        videoView = findViewById(R.id.video_view)
        playButton = findViewById(R.id.play_button)
        recyclerView = findViewById(R.id.recycler_view_videos)

        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = VideoAdapter(videoUrls) { videoUrl ->
            videoView.setVideoURI(Uri.parse(videoUrl))
        }
        recyclerView.adapter = adapter

        playButton.setOnClickListener {
            videoView.start()
        }
    }
}
