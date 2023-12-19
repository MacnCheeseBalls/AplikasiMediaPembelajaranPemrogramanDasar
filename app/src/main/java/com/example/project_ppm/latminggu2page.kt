package com.example.project_ppm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class latminggu2page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.latminggu2page)

        val backbtl2 = findViewById<ImageButton>(R.id.backlat2)

        backbtl2.setOnClickListener {
            Intent(this, activity_listlatihanpage::class.java).also {
                startActivity(it)
            }
        }
    }
}