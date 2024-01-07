package com.example.projectecafeteriadanidiaz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.projectecafeteriadanidiaz.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding: ActivityLoginBinding
    private var email: String = ""
    private var password: String = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        var introMail: String="-"
        var introPassword: String="-"

        if (intent.hasExtra("EMAIL") && intent.hasExtra("PASSWORD")){
            email = intent.getStringExtra("EMAIL") ?: ""
            password = intent.getStringExtra("PASSWORD") ?: ""
        }



        binding.button.setOnClickListener {

            introMail=binding.editTextText.text.toString()
            introPassword=binding.editTextTextPassword.text.toString()

            if ((introMail==email && introPassword==password)&& (introMail!=""&&introPassword!="")) {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else if((introMail!=email || introPassword!=password )||(introMail==""&&introPassword=="")){
                Toast.makeText(this,"Revisa la contrasenya o el mail", Toast.LENGTH_SHORT)
            }
        }
        binding.signin.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }
    }


}