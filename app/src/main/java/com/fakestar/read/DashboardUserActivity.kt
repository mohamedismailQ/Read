package com.fakestar.read

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.fakestar.read.databinding.ActivityDashboardUserBinding

class DashboardUserActivity : AppCompatActivity() {

    // binding view
    private lateinit var binding: ActivityDashboardUserBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashboardUserBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}