package com.example.digiteam

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.ViewCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Enable edge-to-edge display
        WindowCompat.setDecorFitsSystemWindows(window, false)

        // Set the content view to our layout
        setContentView(R.layout.activity_main)

        // Add click listeners for buttons
        val checkInButton = findViewById<Button>(R.id.checkInButton)
        checkInButton.setOnClickListener {
            Toast.makeText(this, "Check-in berhasil", Toast.LENGTH_SHORT).show()
        }

        val createReportButton = findViewById<Button>(R.id.createReportButton)
        createReportButton.setOnClickListener {
            Toast.makeText(this, "Membuat laporan baru", Toast.LENGTH_SHORT).show()
        }

        // Since we're using NestedScrollView as the root, we don't need to handle insets
        // like in the original code
    }
}