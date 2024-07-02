package com.example.summerpractice1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.summerpractice1.databinding.ActivityMainMenuBinding

class MainActivity : AppCompatActivity() {
    private var viewBinding: ActivityMainMenuBinding? = null
    private var controller: NavController? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        viewBinding = ActivityMainNewBinding.inflate(layoutInflater)
//        setContentView(viewBinding?.root)
        viewBinding = ActivityMainMenuBinding.inflate(layoutInflater).also {
            setContentView(it.root)
        }
        initView()
    }

    fun initView() {
        controller =
            (supportFragmentManager.findFragmentById(R.id.nav_host_fragment_activity_main_menu) as NavHostFragment).navController
        controller?.let { navController ->
            viewBinding?.navView?.setupWithNavController(navController)
        }
    }
}