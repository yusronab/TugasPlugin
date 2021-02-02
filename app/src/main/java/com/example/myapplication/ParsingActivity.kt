package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_parsing.*

class ParsingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_parsing)

        btnLogin.setOnClickListener {
            if (etUsername.text.trim().isNotEmpty() && etPassword.text.trim().isNotEmpty()){
                Toast.makeText(this, "Login Success", Toast.LENGTH_SHORT).show()
                val username = etUsername.text.toString()
                val password = etPassword.text.toString()
                Intent(Intent(this, HasilparsingActivity::class.java)).also {
                    it.putExtra("username", username)
                    it.putExtra("password", password)
                    startActivity(it)
                }
            }else{
                Toast.makeText(this, "Login Failed", Toast.LENGTH_SHORT).show()
            }
        }
        btnBack2.setOnClickListener {
            finish()
        }
    }
}