package com.example.project_ppm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class materi3page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.materi3page)

        val backbtm3 = findViewById<ImageButton>(R.id.backm3)

        backbtm3.setOnClickListener {
            Intent(this, activity_listmateripage::class.java).also {
                startActivity(it)
            }
        }
    }
}