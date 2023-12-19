package com.example.project_ppm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class latminggu4page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.latminggu4page)

        val backbtl4 = findViewById<ImageButton>(R.id.backlat4)

        backbtl4.setOnClickListener {
            Intent(this, activity_listlatihanpage::class.java).also {
                startActivity(it)
            }
        }
    }
}