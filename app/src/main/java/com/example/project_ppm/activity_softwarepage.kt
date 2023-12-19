package com.example.project_ppm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class activity_softwarepage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.softwarepage)

        val backswpg = findViewById<ImageButton>(R.id.backsw)

        backswpg.setOnClickListener {
            Intent(this, activity_dashboardpage::class.java).also {
                startActivity(it)
            }
        }
    }
}