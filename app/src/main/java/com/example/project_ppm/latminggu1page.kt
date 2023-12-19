package com.example.project_ppm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class latminggu1page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.latminggu1page)

        val backbtl1 = findViewById<ImageButton>(R.id.backlat1)

        backbtl1.setOnClickListener {
            Intent(this, activity_listlatihanpage::class.java).also {
                startActivity(it)
            }
        }
    }
}