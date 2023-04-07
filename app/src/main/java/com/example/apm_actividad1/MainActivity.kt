package com.example.apm_actividad1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private val username = "Juan Torres";
    private val password = "1234utn";
    private lateinit var usernameBox: EditText;
    private lateinit var passwordBox: EditText;
    private lateinit var loginButton: Button;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        usernameBox = findViewById(R.id.username)
        passwordBox = findViewById(R.id.password)
        loginButton = findViewById(R.id.loginButton)

        loginButton.setOnClickListener {
            val inputUsername = usernameBox.text.toString()
            val inputPassword = passwordBox.text.toString()

            if (inputUsername == username && inputPassword == password) {
                // Datos ingresados correctamente, mostrar la pantalla de bienvenida
                // TODO: Implementar la lógica para mostrar la pantalla de bienvenida

            } else {
                // Datos ingresados incorrectos, mostrar mensaje de error
                usernameBox.visibility = View.INVISIBLE
            }
        }

       /* register_button.setOnClickListener {
            // TODO: Implementar la lógica para registrar nuevos usuarios
        }*/
    }
}
