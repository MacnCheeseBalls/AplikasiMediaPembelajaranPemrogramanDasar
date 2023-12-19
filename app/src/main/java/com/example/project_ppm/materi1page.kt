package com.example.project_ppm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class materi1page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.materi1page)

        val backbtm1 = findViewById<ImageButton>(R.id.backm1)

        backbtm1.setOnClickListener {
            Intent(this, activity_listmateripage::class.java).also {
                startActivity(it)
            }
        }

    }
}