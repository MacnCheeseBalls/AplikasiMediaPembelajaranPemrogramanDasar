package com.example.project_ppm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class materi4page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.materi4page)

        val backbtm4 = findViewById<ImageButton>(R.id.backm4)

        backbtm4.setOnClickListener {
            Intent(this, activity_listmateripage::class.java).also {
                startActivity(it)
            }
        }
    }
}