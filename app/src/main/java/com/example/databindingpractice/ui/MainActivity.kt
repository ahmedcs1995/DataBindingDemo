package com.example.databindingpractice.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.example.databindingpractice.R
import com.example.databindingpractice.data.AppViewModel
import com.example.databindingpractice.databinding.ActivityMainBindingImpl

class MainActivity : AppCompatActivity() {

    //view model
    private val viewModel by lazy {
        ViewModelProviders.of(this).get(AppViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding : ActivityMainBindingImpl = DataBindingUtil.setContentView(this,R.layout.activity_main)

        binding.lifecycleOwner = this

        binding.viewmodel = viewModel

    }
}
