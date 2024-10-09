package com.example.app_mascotas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.Fragment

class ToolsFragment : Fragment() {

    private lateinit var webView: WebView
    private lateinit var searchView: SearchView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tools, container, false)

        // Inicializar el WebView
        webView = view.findViewById(R.id.webview_tools)
        searchView = view.findViewById(R.id.search_view)

        // Configurar el WebView para que abra las URLs dentro de la aplicación
        webView.webViewClient = WebViewClient()

        // Habilitar JavaScript si es necesario
        webView.settings.javaScriptEnabled = true

        // Cargar una URL por defecto (puedes cambiarla)
        webView.loadUrl("https://www.example.com")

        // Configurar el SearchView para manejar las búsquedas y URLs
        searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                // Cargar la URL o hacer una búsqueda
                query?.let {
                    if (it.startsWith("http://") || it.startsWith("https://")) {
                        webView.loadUrl(it)
                    } else {
                        // Realiza una búsqueda en Google si no es una URL
                        webView.loadUrl("https://www.google.com/search?q=$it")
                    }
                }
                return false
            }

            override fun onQueryTextChange(newText: String?): Boolean {
                // No es necesario manejar los cambios en el texto
                return false
            }
        })

        return view
    }
}
