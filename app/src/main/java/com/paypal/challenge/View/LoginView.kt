package com.paypal.challenge.View

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModel
import com.paypal.challenge.R
import com.paypal.challenge.ViewModel.LoginViewModel

class LoginView : AppCompatActivity()
{
    private lateinit var username: EditText
    private lateinit var password: EditText


    private val viewModel: LoginViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        username = findViewById<EditText>(R.id.editText_username)
        password = findViewById<EditText>(R.id.editText_password)

        viewModel.validateLogin(username, password)
    }


}