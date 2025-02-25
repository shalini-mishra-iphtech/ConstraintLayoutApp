package com.example.constraintlayoutapp

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
                // Finding Views by ID
                val followButton = findViewById<Button>(R.id.followButton)
                val messageButton = findViewById<Button>(R.id.messageButton)

                // Set Click Listener for Follow Button
                followButton.setOnClickListener {
                    Toast.makeText(this, "Followed!", Toast.LENGTH_SHORT).show()
                }

                // Set Click Listener for Message Button
                messageButton.setOnClickListener {
                    Toast.makeText(this, "Message Sent!", Toast.LENGTH_SHORT).show()
                }
            }
        }


