package com.example.app_mascotas

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class VideosActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_videos)

        // Vincular VideoView y botón de play
        val videoView: VideoView = findViewById(R.id.video_view)
        val playButton: Button = findViewById(R.id.play_button)

        // Asignar el video desde un recurso o URL
        val videoUri: Uri = Uri.parse("android.resource://" + packageName + "/" + "nombredelvideoencarpeta")// R.raw.sample_video)
        videoView.setVideoURI(videoUri)

        // Reproducir el video al hacer clic en el botón
        playButton.setOnClickListener {
            videoView.start()
        }
    }
}
