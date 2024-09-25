package com.example.app_mascotas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class PerfilFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflar el layout del fragmento
        val view = inflater.inflate(R.layout.activity_perfil, container, false)

        // Vincular las vistas con sus IDs
        val dogName: TextView = view.findViewById(R.id.dog_name)
        val dogBreed: TextView = view.findViewById(R.id.dog_breed)
        val dogImage: ImageView = view.findViewById(R.id.dog_image)
        val dogDescription: TextView = view.findViewById(R.id.dog_description)

        // Asignar los textos dinámicamente
        dogName.text = "Dasha"
        dogBreed.text = "Golden Retriever"
        dogDescription.text = """
            El Golden Retriever es una raza de perro conocida por su amabilidad,
            inteligencia y aspecto atractivo. Originario de Escocia, es famoso por su pelaje 
            dorado, que puede variar desde un dorado claro hasta un dorado oscuro.
        """.trimIndent()

        // Asignar una imagen al ImageView del perro (asegúrate de tener esta imagen en res/drawable)
        dogImage.setImageResource(R.drawable.ic_dog_image)

        return view
    }
}
