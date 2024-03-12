package com.example.novasentinel

import android.app.AlertDialog
import android.app.DatePickerDialog
import android.content.Intent
import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.DatePicker
import android.widget.EditText
import com.example.novasentinel.databinding.ActivityRegistroBinding
import java.util.Date
import java.util.Locale


class RegistroActivity : AppCompatActivity() {

    private lateinit var binding: ActivityRegistroBinding
    private lateinit var etFechaNacimiento: EditText
    private lateinit var editTextGenero: EditText

    private val cal = Calendar.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityRegistroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        etFechaNacimiento = binding.FechaNacimiento
        editTextGenero = binding.editTextGenero

        // Configurar clic en el EditText de Fecha de Nacimiento para mostrar el DatePickerDialog
        etFechaNacimiento.setOnClickListener {
            showDatePickerDialog()
        }

        // Configurar clic en el EditText de Género para mostrar el AlertDialog
        editTextGenero.setOnClickListener {
            showGenderSelectionDialog()
        }

        // Configurar clic en el botón btn_ya_tiene_cuenta para ir a ActivityEntrada
        binding.btnYaTieneCuenta.setOnClickListener {
            val intent = Intent(this, EntradaActivity::class.java)
            startActivity(intent)
            finish() // Esto cierra la actividad actual
        }
    }

    private fun showDatePickerDialog() {
        val datePicker = DatePickerDialog(
            this,
            { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
                cal.set(Calendar.YEAR, year)
                cal.set(Calendar.MONTH, month)
                cal.set(Calendar.DAY_OF_MONTH, dayOfMonth)
                updateDateInView()
            },
            cal.get(Calendar.YEAR),
            cal.get(Calendar.MONTH),
            cal.get(Calendar.DAY_OF_MONTH)
        )

        datePicker.datePicker.maxDate = Date().time // Establecer fecha máxima como la fecha actual
        datePicker.show()
    }

    private fun updateDateInView() {
        val myFormat = "dd/MM/yyyy" // Formato de fecha
        val sdf = SimpleDateFormat(myFormat, Locale.getDefault())
        etFechaNacimiento.setText(sdf.format(cal.time))
    }

    private fun showGenderSelectionDialog() {
        val genderOptions = arrayOf("Femenino", "Masculino", "Otro")

        val builder = AlertDialog.Builder(this, R.style.AlertDialogTheme) // Usar el estilo personalizado
        builder.setTitle("Seleccionar Género")
        builder.setItems(genderOptions) { dialog, which ->
            val selectedGender = genderOptions[which]
            editTextGenero.setText(selectedGender)
            dialog.dismiss()
        }

        val dialog = builder.create()
        dialog.show()
    }
}