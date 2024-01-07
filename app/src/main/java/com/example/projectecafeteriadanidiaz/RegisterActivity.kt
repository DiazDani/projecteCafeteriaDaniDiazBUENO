package com.example.projectecafeteriadanidiaz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.projectecafeteriadanidiaz.databinding.ActivityRegisterBinding

class RegisterActivity : AppCompatActivity() {
    private lateinit var binding: ActivityRegisterBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
    }
}