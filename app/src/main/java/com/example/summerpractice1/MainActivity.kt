package com.example.summerpractice1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.summerpractice1.databinding.ActivityMainNewBinding

class MainActivity : AppCompatActivity() {
    private var viewBinding: ActivityMainNewBinding? = null
    private var controller: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        viewBinding = ActivityMainNewBinding.inflate(layoutInflater)
//        setContentView(viewBinding?.root)
        viewBinding = ActivityMainNewBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        initView()

    }

    fun initView() {
        controller =
            (supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main_new) as NavHostFragment).navController
        controller?.let { navController ->
            viewBinding?.navView?.setupWithNavController(navController)
        }


    }
}