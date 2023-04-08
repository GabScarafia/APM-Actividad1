package com.example.apm_actividad1

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class Registro: AppCompatActivity() {

    private lateinit var editName: EditText
    private lateinit var editEmail: EditText
    private lateinit var editPassword: EditText
    private lateinit var editConfirmPassword: EditText
    private lateinit var buttonCreateAccount: Button

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        editName = findViewById(R.id.name)
        editEmail = findViewById(R.id.email)
        editPassword = findViewById(R.id.password)
        editConfirmPassword = findViewById(R.id.confirmPassword)
        buttonCreateAccount = findViewById(R.id.buttonCreateAccount)
        buttonCreateAccount.setOnClickListener {
            if (validateFields()) {
                //Return to login screen hay que ver como pasar el nuevo usuario.
                finish()
            }
        }
        editPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(s: Editable?) {
                validatePassword()
            }
        })
        editConfirmPassword.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun afterTextChanged(s: Editable?) {
                validatePassword()
            }
        })
    }
    private fun validateFields(): Boolean
    {
        val name = editName.text.toString()
        val email = editEmail.text.toString()
        val password = editPassword.text.toString()
        val confirmPassword = editConfirmPassword.text.toString()
        if (name.isEmpty())
        {
            editName.error = "Name is required"
            return false
        }
        if (email.isEmpty())
        {
            editEmail.error = "Email is required"
            return false
        }
        if (password.length < 6)
        {
            editPassword.error = "Password must be at least 6 characters"
            return false
        }
        if (password != confirmPassword)
        {
            editConfirmPassword.error = "Passwords do not match"
            return false
        }
        return true
    }
    private fun validatePassword() {
        val password = editPassword.text.toString()
        val confirmPassword = editConfirmPassword.text.toString()

        if (confirmPassword.isNotEmpty() && password != confirmPassword) {
            editConfirmPassword.error = "Passwords do not match"
        } else {
            editConfirmPassword.error = null
        }
    }
}