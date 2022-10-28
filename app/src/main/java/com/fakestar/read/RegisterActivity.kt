package com.fakestar.read

import android.app.ProgressDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fakestar.read.databinding.ActivityRegisterBinding
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {

    // bindingView
    private lateinit var binding: ActivityRegisterBinding
    // firebase auth
    private lateinit var firebaseAuth: FirebaseAuth
    // progressBar
    private lateinit var progressBar: ProgressDialog


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // inflate layout by binding
        binding = ActivityRegisterBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // init firebase
        firebaseAuth = FirebaseAuth.getInstance()

        //init progressBar for register load
        progressBar = ProgressDialog(this)
        progressBar.setTitle("please wait while we create your account")
        progressBar.setCanceledOnTouchOutside(false)


        //handle the register btn
        binding.registerAccount.setOnClickListener {
            startActivity(Intent(this,DashboardUserActivity::class.java))
            /*steps
            * 1) input data
            * 2) validate data
            * 3) create account firebase auth
            * 4) save data firebase realtime database
             */
            validateData()
        }
    }

    private var name = ""
    private var email = ""
    private var password = ""

    private fun validateData() {
        //input data
        name = binding.nameReg.text.toString().trim()
        email = binding.emailReg.text.toString().trim()
        password = binding.passwordReg.toString().trim()
        val confirmPass = binding.confirmPasswordReg.toString().trim()
    }
}










