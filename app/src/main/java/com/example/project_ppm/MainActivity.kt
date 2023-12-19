package com.example.project_ppm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpage)

        val btnclick1 = findViewById<ImageButton>(R.id.masukbtn)

        btnclick1.setOnClickListener {
            Intent(this, activity_dashboardpage::class.java).also {
                startActivity(it)
            }
        }
    }
}