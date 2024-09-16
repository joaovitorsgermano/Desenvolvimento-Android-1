package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var cliqueBt: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        cliqueBt = findViewById(R.id.cliqueBt)
        cliqueBt.setOnClickListener {
            Toast.makeText(this, "Você clicou no botão", Toast.LENGTH_SHORT).show()
        }
    }
}