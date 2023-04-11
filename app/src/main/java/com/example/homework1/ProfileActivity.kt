package com.example.homework1


import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Paint
import android.os.Bundle
import android.text.SpannableString
import android.text.style.UnderlineSpan
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class ProfileActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val backButton = findViewById<TextView>(R.id.design_image_bb)


        backButton.setOnClickListener {

            val intent = Intent(this,LoginActivity::class.java)

            startActivity(intent)
        }


    }
}