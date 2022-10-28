package com.fakestar.read

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        // here i create handler for the splash screen to make it
        // stay to 2 second after that going to MainActivity
        Handler().postDelayed ( Runnable{
            startActivity(Intent(this,MainActivity::class.java))
            finish()
        },2000)


    }
}