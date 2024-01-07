package com.example.projectecafeteriadanidiaz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectecafeteriadanidiaz.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener{
            val email= binding.editTextText.text.toString()
            val password= binding.editTextTextPassword.text.toString()

            val intent = Intent(this,LoginActivity::class.java)

            intent.putExtra("EMAIL", email)
            intent.putExtra("PASSWORD", password)

            startActivity(intent)
        }

    }
}