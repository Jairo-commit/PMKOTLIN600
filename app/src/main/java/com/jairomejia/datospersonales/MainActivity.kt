package com.jairomejia.datospersonales

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val edtNombre = findViewById<EditText?>(R.id.editTextTextNombre)
        val edtApellido = findViewById<EditText?>(R.id.editTextApellido)
        val edtDireccion = findViewById<EditText?>(R.id.editTextDireccion)
        val edtTelefono = findViewById<EditText?>(R.id.editTextTelefono)
        val edtCedula = findViewById<EditText?>(R.id.editTextCedula)
        val edtCorreo = findViewById<EditText?>(R.id.editTextCorreo)
        val edtEstrato = findViewById<EditText?>(R.id.editTextEstrato)
        val edtEstadoCivil = findViewById<EditText?>(R.id.editTextEstadoCivil)
        val edtProfesion = findViewById<EditText?>(R.id.editTextProfesion)
        val edtNacionalidad = findViewById<EditText?>(R.id.editTextNacionalidad)

        val txvNombre = findViewById<TextView?>(R.id.textViewNombre)
        val txvApellido = findViewById<TextView?>(R.id.textViewApellido)
        val txvDireccion = findViewById<TextView?>(R.id.textViewDireccion)
        val txvTelefono = findViewById<TextView?>(R.id.textViewTelefono)
        val txvCedula = findViewById<TextView?>(R.id.textViewCedula)
        val txvCorreo = findViewById<TextView?>(R.id.textViewCorreo)
        val txvEstrato = findViewById<TextView?>(R.id.textViewEstrato)
        val txvEstadoCivil = findViewById<TextView?>(R.id.textViewEstadoCivil)
        val txvProfesion = findViewById<TextView?>(R.id.textViewProfesion)
        val txvNacionalidad = findViewById<TextView?>(R.id.textViewNacionalidad)

        val btnAceptar = findViewById<Button?>(R.id.buttonAceptar)
        btnAceptar.setOnClickListener(View.OnClickListener { v: View? ->
            edtNombre.setText("Carlos")
            edtApellido.setText("Pérez")
            edtDireccion.setText("Calle 123")
            edtTelefono.setText("555-1234")
            edtCedula.setText("123456789")
            edtCorreo.setText("carlos@email.com")
            edtEstrato.setText("3")
            edtEstadoCivil.setText("Casado")
            edtProfesion.setText("Ingeniero")
            edtNacionalidad.setText("Colombiano")
        })

        val buttonCancelar = findViewById<Button?>(R.id.buttonCancelar)

        buttonCancelar.setOnClickListener(View.OnClickListener { v: View? ->
            edtNombre.setText("")
            edtApellido.setText("")
            edtDireccion.setText("")
            edtTelefono.setText("")
            edtCedula.setText("")
            edtCorreo.setText("")
            edtEstrato.setText("")
            edtEstadoCivil.setText("")
            edtProfesion.setText("")
            edtNacionalidad.setText("")
        })
    }
}