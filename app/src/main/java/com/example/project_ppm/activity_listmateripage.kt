package com.example.project_ppm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class activity_listmateripage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listmateripage)

        val backbt = findViewById<ImageButton>(R.id.backlistmateri)
        val btm1 = findViewById<ImageButton>(R.id.m1button)
        val btm2 = findViewById<ImageButton>(R.id.m2button)
        val btm3 = findViewById<ImageButton>(R.id.m3button)
        val btm4 = findViewById<ImageButton>(R.id.m4button)

        backbt.setOnClickListener {
            Intent(this, activity_dashboardpage::class.java).also {
                startActivity(it)
            }
        }

        btm1.setOnClickListener {
            Intent(this, materi1page::class.java).also {
                startActivity(it)
            }
        }

        btm2.setOnClickListener {
            Intent(this, materi2page::class.java).also {
                startActivity(it)
            }
        }

        btm3.setOnClickListener {
            Intent(this, materi3page::class.java).also {
                startActivity(it)
            }
        }

        btm4.setOnClickListener {
            Intent(this, materi4page::class.java).also {
                startActivity(it)
            }
        }

    }
}