package com.example.novasentinel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.novasentinel.databinding.ActivityRestablecerBinding

class RestablecerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRestablecerBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRestablecerBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el OnClickListener para el botón btn_volver_inicio
        binding.btnVolverInicio.setOnClickListener {
            // Crear un Intent para ir a EntradaActivity
            val intent = Intent(this, EntradaActivity::class.java)
            startActivity(intent)
            finish() // Esto cierra la actividad actual
        }
    }
}
