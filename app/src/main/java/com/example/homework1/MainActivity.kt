package com.example.homework1


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val nextButton = findViewById<AppCompatButton>(R.id.mainNextButton)
        val skipButton = findViewById<TextView>(R.id.skipNowButton)

        nextButton.setOnClickListener {

            val intent = Intent(this,LoginActivity::class.java)

            startActivity(intent)
        }
        skipButton.setOnClickListener {

            val intent = Intent(this,LoginActivity::class.java)

            startActivity(intent)
        }
    }
}