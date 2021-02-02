package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_hasilparsing.*

class HasilparsingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hasilparsing)

        val username = intent.getStringExtra("username")
        val password = intent.getStringExtra("password")

        hasilParsing.text = "Welcome Back $username, how are you today?"

        btnBack3.setOnClickListener {
            finish()
        }
    }
}