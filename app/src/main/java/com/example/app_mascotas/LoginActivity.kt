package com.example.app_mascotas

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {

    // Declaración de las variables para los componentes de la interfaz
    private lateinit var usernameEditText: EditText
    private lateinit var passwordEditText: EditText
    private lateinit var loginButton: Button
    private lateinit var loginTitleTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)  // Vincular el XML con la actividad

        // Vincular los componentes de la interfaz con las variables en Kotlin
        usernameEditText = findViewById(R.id.username)
        passwordEditText = findViewById(R.id.password)
        loginButton = findViewById(R.id.login_button)
        loginTitleTextView = findViewById(R.id.login_title)

        // Evento clic para el botón de iniciar sesión
        loginButton.setOnClickListener {
            loginUser()
        }
    }

    // Método para manejar el inicio de sesión
    private fun loginUser() {
        val username = usernameEditText.text.toString()
        val password = passwordEditText.text.toString()

        if (username.isNotEmpty() && password.isNotEmpty()) {
            // Mostrar mensaje de éxito (aquí puedes implementar la lógica de autenticación)
            Toast.makeText(this, "Inicio de sesión exitoso", Toast.LENGTH_SHORT).show()
            loginTitleTextView.text = "Autenticando..."
        } else {
            // Muestra un mensaje si los campos están vacíos
            Toast.makeText(this, "Por favor ingresa usuario y contraseña", Toast.LENGTH_SHORT).show()
            loginTitleTextView.text = "Por favor ingresa tus credenciales."
        }
    }
}
