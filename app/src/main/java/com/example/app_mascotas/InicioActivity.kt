package com.example.app_mascotas

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class InicioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)

        // Vincular los TextView con los IDs del XML
        val welcomeTitle: TextView = findViewById(R.id.welcome_title)
        val appName: TextView = findViewById(R.id.app_name)
        val welcomeDescription: TextView = findViewById(R.id.welcome_description)
        val welcomeFooter: TextView = findViewById(R.id.welcome_footer)

        // Asignar los textos dinámicamente
        welcomeTitle.text = "¡Bienvenido a"
        appName.text = "App Patitas!"
        welcomeDescription.text = "Explora nuestras características, personaliza tu experiencia y no dudes en contactarnos si necesitas ayuda. ¡Estamos aquí para hacer tu vida más fácil y emocionante!"
        welcomeFooter.text = "¡Comencemos esta aventura juntos!"
    }
}
