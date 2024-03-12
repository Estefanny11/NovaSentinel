package com.example.novasentinel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.novasentinel.databinding.ActivityEntradaBinding

class EntradaActivity : AppCompatActivity() {

    private lateinit var binding: ActivityEntradaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEntradaBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Configurar el OnClickListener para el botón btnEntrar
        binding.btnEntrar.setOnClickListener {
            // Crear un Intent para ir a MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Esto cierra la actividad actual
        }

        // Configurar el OnClickListener para el botón btnrecuperarcontra
        binding.btnrecuperarcontra.setOnClickListener {
            // Crear un Intent para ir a RestablecerActivity
            val intent = Intent(this, RestablecerActivity::class.java)
            startActivity(intent)
        }

        // Configurar el OnClickListener para el botón btnregistrar
        binding.btnregistrar.setOnClickListener {
            // Crear un Intent para ir a RegistroActivity
            val intent = Intent(this, RegistroActivity::class.java)
            startActivity(intent)
        }
    }
}

