package com.example.project_ppm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class activity_silabuspage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.silabuspage)

        val backsbpg = findViewById<ImageButton>(R.id.backsb)

        backsbpg.setOnClickListener {
            Intent(this, activity_dashboardpage::class.java).also {
                startActivity(it)
            }
        }
    }
}