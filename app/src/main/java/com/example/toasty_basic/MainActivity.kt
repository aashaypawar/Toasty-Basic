package com.example.toasty_basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import es.dmoral.toasty.Toasty

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnError = findViewById<Button>(R.id.errorBtn)
        val btnSuccess = findViewById<Button>(R.id.successBtn)
        val btnInfo = findViewById<Button>(R.id.infoBtn)
        val btnWarning = findViewById<Button>(R.id.warningBtn)
        val btnNormal = findViewById<Button>(R.id.normalBtn)

        btnError.setOnClickListener {
            Toasty.error(applicationContext,"Some Error", Toast.LENGTH_SHORT).show()
        }

        btnSuccess.setOnClickListener {
            Toasty.success(applicationContext,"Some Success",Toast.LENGTH_SHORT).show()
        }

        btnInfo.setOnClickListener {
            Toasty.info(applicationContext,"Some info",Toast.LENGTH_SHORT).show()
        }

        btnWarning.setOnClickListener {
            Toasty.warning(applicationContext,"Some Warning",Toast.LENGTH_SHORT).show()
        }

        btnNormal.setOnClickListener {
            Toasty.normal(applicationContext,"Some Normal",Toast.LENGTH_SHORT).show()
        }
    }
}