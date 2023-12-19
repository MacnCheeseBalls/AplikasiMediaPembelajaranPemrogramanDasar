package com.example.project_ppm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class activity_loginpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.loginpage)

        val masukbtn: ImageButton = findViewById<ImageButton>(R.id.masukbtn)
        masukbtn.setOnClickListener {
            val intent = Intent(this, activity_dashboardpage::class.java)
            startActivity(intent)
        }
    }
}