package com.example.summerpractice1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.summerpractice1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var viewBinding: ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContentView(ActivityMainBinding.inflate(layoutInflater))

    }

    fun init() {

    }

}