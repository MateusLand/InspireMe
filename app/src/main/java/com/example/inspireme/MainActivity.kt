package com.example.inspireme

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btFront: Button = findViewById(R.id.bt_Front)
        btFront.setOnClickListener {
            Log.d("QuoteActivity", "Button Clicked!") // Log statement


            val intent = Intent(this, QuoteActivity::class.java)
            startActivity(intent)
        }
    }
}