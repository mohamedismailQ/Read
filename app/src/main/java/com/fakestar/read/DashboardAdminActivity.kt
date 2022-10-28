package com.fakestar.read

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fakestar.read.databinding.ActivityDashboardAdminBinding

class DashboardAdminActivity : AppCompatActivity() {

    // bindingView
    private lateinit var binding: ActivityDashboardAdminBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardAdminBinding.inflate(layoutInflater)
        setContentView(binding.root)



    }
}