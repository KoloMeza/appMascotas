package com.example.app_mascotas

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        // Vincular las vistas con sus IDs
        val backButton: ImageView = findViewById(R.id.back_button)
        val appTitle: TextView = findViewById(R.id.app_title)
        val dogName: TextView = findViewById(R.id.dog_name)
        val dogBreed: TextView = findViewById(R.id.dog_breed)
        val dogImage: ImageView = findViewById(R.id.dog_image)
        val dogDescription: TextView = findViewById(R.id.dog_description)

        // Configurar evento de clic en el botón de retroceso
        backButton.setOnClickListener {
            finish()  // Finaliza la actividad actual y regresa a la anterior
        }

        // Asignar textos dinámicamente
        appTitle.text = "APP PATITAS"
        dogName.text = "Dasha"
        dogBreed.text = "Golden Retriever"

        // Asignar una descripción más detallada de la raza
        dogDescription.text = """
            El Golden Retriever es una raza de perro conocida por su amabilidad, 
            inteligencia y aspecto atractivo. Originario de Escocia, es famoso por su pelaje 
            dorado, que puede variar desde un dorado claro hasta un dorado oscuro.
        """.trimIndent()

        // Asignar una imagen al ImageView del perro
        dogImage.setImageResource(R.drawable.ic_dog_image)  // Asegúrate de tener esta imagen en res/drawable
    }
}
