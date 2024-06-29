package com.example.summerpractice1

import java.time.Year

open class Car{
    val model: String
    val brend: String
    val yearRelease: Year
    val maxSpeed: Int

    constructor(model: String, brend: String, yearRelease: Year, maxSpeed: Int) {
        this.model = model
        this.brend = brend
        this.yearRelease = yearRelease
        this.maxSpeed = maxSpeed
    }


    open fun getInfo() : String {
        return "Brend - $brend, Model - $model, Year of release - $yearRelease, Maximum speed - $maxSpeed";
    }

    fun printInfo(){
        println(getInfo())
    }


}