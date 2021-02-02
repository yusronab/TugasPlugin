package com.example.myapplication

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.system.exitProcess

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnProfil.setOnClickListener {
            startActivity(Intent(this, ProfileActivity::class.java))
        }
        btnParsing.setOnClickListener {
            startActivity(Intent(this, ParsingActivity::class.java))
        }
        btnGithub.setOnClickListener {
            val github = Intent(Intent.ACTION_VIEW)
            github.setData(Uri.parse("https://github.com/yusronab"))
            startActivity(github)
        }
        btnExit.setOnClickListener {
            finish()
        }
    }
}