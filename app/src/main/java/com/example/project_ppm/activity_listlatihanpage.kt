package com.example.project_ppm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class activity_listlatihanpage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.listlatihanpage)

        val backbtlat = findViewById<ImageButton>(R.id.backlistlat)
        val btl1 = findViewById<ImageButton>(R.id.lat1bt)
        val btl2 = findViewById<ImageButton>(R.id.lat2bt)
        val btl3 = findViewById<ImageButton>(R.id.lat3bt)
        val btl4 = findViewById<ImageButton>(R.id.lat4bt)

        backbtlat.setOnClickListener {
            Intent(this, activity_dashboardpage::class.java).also {
                startActivity(it)
            }
        }

        btl1.setOnClickListener {
            Intent(this, latminggu1page::class.java).also {
                startActivity(it)
            }
        }

        btl2.setOnClickListener {
            Intent(this, latminggu2page::class.java).also {
                startActivity(it)
            }
        }

        btl3.setOnClickListener {
            Intent(this, latminggu3page::class.java).also {
                startActivity(it)
            }
        }

        btl4.setOnClickListener {
            Intent(this, latminggu4page::class.java).also {
                startActivity(it)
            }
        }
    }
}