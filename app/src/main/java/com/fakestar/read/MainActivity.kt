package com.fakestar.read

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fakestar.read.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // viewBinding for fast call instead of findViewById less error and more powerful
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // here we handle the click on login btn
        binding.loginBtn.setOnClickListener {
            startActivity(Intent(this,LoginActivity::class.java))
        }
        // handle skip btn click
        binding.skip.setOnClickListener {
            startActivity(Intent(this,DashboardUserActivity::class.java))
        }


    }


}