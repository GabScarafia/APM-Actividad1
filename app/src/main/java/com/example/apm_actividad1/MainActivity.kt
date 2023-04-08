package com.example.apm_actividad1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {
    private val username = "Juan Torres";
    private val password = "1234utn";
    private lateinit var usernameBox: EditText;
    private lateinit var passwordBox: EditText;
    private lateinit var loginButton: Button;
    private lateinit var registerButton: Button;
    private lateinit var error: MaterialTextView;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameBox = findViewById(R.id.username)
        passwordBox = findViewById(R.id.password)
        loginButton = findViewById(R.id.loginButton)
        registerButton = findViewById(R.id.registerButton)
        error = findViewById(R.id.error)

        loginButton.setOnClickListener {
            val inputUsername = usernameBox.text.toString()
            val inputPassword = passwordBox.text.toString()

            if (inputUsername == username && inputPassword == password) {
                // Datos ingresados correctamente, mostrar la pantalla de bienvenida
                // TODO: Implementar la lógica para mostrar la pantalla de bienvenida
                val intent = Intent(this, Bienvenida::class.java)
                startActivity(intent)

            } else {
                // Datos ingresados incorrectos, mostrar mensaje de error
                error.visibility = View.VISIBLE
            }
        }

        registerButton.setOnClickListener {
           //TODO: Implementar la lógica para registrar nuevos usuarios
            val intent = Intent(this, Registro::class.java)
            startActivity(intent)
        }
    }
}
