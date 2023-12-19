package com.example.project_ppm

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class activity_dashboardpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.dashboardpage)

        val btclick1 = findViewById<ImageButton>(R.id.mateributton)
        val btclick2 = findViewById<ImageButton>(R.id.latihanbutton)
        val btclick3 = findViewById<ImageButton>(R.id.softwarebutton)
        val btclick4 = findViewById<ImageButton>(R.id.silabusbutton)
        val btclick5 = findViewById<ImageButton>(R.id.logoutbutton)

        btclick1.setOnClickListener {
            Intent(this, activity_listmateripage::class.java).also {
                startActivity(it)
            }
        }

        btclick2.setOnClickListener {
            Intent(this, activity_listlatihanpage::class.java).also {
                startActivity(it)
            }
        }

        btclick3.setOnClickListener {
            Intent(this, activity_softwarepage::class.java).also {
                startActivity(it)
            }
        }

        btclick4.setOnClickListener {
            Intent(this, activity_silabuspage::class.java).also {
                startActivity(it)
            }
        }

        btclick5.setOnClickListener {
            Intent(this, MainActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}