package com.fakestar.read

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fakestar.read.databinding.ActivityLoginBinding
import com.fakestar.read.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.loginBtn.setOnClickListener {
            startActivity(Intent(this,DashboardAdminActivity::class.java))
        }

        binding.noAccount.setOnClickListener {
            startActivity(Intent(this,RegisterActivity::class.java))
        }

    }
}