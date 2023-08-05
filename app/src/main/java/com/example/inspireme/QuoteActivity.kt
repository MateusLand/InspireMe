package com.example.inspireme

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.TypedValue
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class QuoteActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quote)

        val quotes = listOf(
            "Don't let yesterday take up too much of today",
            "No Pressure, no diamonds",
            "You can do anything, but not everything",
            "Be yourself; everyone else is already taken",
        )

        val authors = listOf(
            "Will Rogers",
            "Thomas Carlyle",
            "David Allen",
            "Anonymous",
        )

        val generateButton: Button = findViewById(R.id.bt_Generate)
        val quoteTextView: TextView = findViewById(R.id.tv_Quote)
        val authorTextView: TextView = findViewById(R.id.tv_Author)

        generateButton.setOnClickListener {
            val randomIndex = (0 until quotes.size).random()

            val randomQuote = quotes[randomIndex]
            val randomAuthor = authors[randomIndex] // Create a corresponding authors list

            quoteTextView.text = randomQuote
            authorTextView.text = "- $randomAuthor" // Display author below the quote
        }
    }
}
