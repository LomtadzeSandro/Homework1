package com.example.homework1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginButton = findViewById<AppCompatButton>(R.id.loginButton)
        val skipButton = findViewById<TextView>(R.id.skipNowButton)


        loginButton.setOnClickListener{
            val intent = Intent(this,ProfileActivity::class.java)

            startActivity(intent)
        }
        skipButton.setOnClickListener {

            val intent = Intent(this,ProfileActivity::class.java)

            startActivity(intent)
        }

    }
}