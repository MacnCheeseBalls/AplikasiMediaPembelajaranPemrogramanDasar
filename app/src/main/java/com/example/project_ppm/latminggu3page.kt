package com.example.project_ppm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class latminggu3page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.latminggu3page)

        val backbtl3 = findViewById<ImageButton>(R.id.backlat3)

        backbtl3.setOnClickListener {
            Intent(this, activity_listlatihanpage::class.java).also {
                startActivity(it)
            }
        }
    }
}