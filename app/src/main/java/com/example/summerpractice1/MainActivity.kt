package com.example.summerpractice1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private var header: TextView? = null
    private var button: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        initViews()
        val editText = findViewById<EditText>(R.id.editText)

        button?.setOnClickListener {
            var cars = mutableListOf<Car>()
            try {
                for (i in 1..editText.text.toString().toInt()){
                    var car = Tools().createCar()
                    car.numberCarInRace = i
                    cars.add(car)
                }
                header?.text = Tools().race(cars, "")
            }
            catch (e: NumberFormatException){
                header?.text = "Пожалуйста, введите число"
            }



        }

    }
    private fun initViews(){
        this.button = findViewById(R.id.runButton)
        this.header = findViewById(R.id.textView)
    }
}