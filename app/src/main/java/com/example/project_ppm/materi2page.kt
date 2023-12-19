package com.example.project_ppm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class materi2page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.materi2page)

        val backbtm2 = findViewById<ImageButton>(R.id.backm2)

        backbtm2.setOnClickListener {
            Intent(this, activity_listmateripage::class.java).also {
                startActivity(it)
            }
        }
    }
}