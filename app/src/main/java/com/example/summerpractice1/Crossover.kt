package com.example.summerpractice1

import java.time.Year

class Crossover : Car {
    val weight: Int
    val engineCapacity: Double

    constructor(
        model: String,
        brend: String,
        yearRelease: Year,
        maxSpeed: Int,
        weight: Int,
        engineCapacity: Double
    ) : super(model, brend, yearRelease, maxSpeed) {
        this.weight = weight
        this.engineCapacity = engineCapacity
    }


    override fun getInfo() : String {
        return "Brend - $brend, Model - $model, Year of release - $yearRelease, " +
                "Maximum speed - $maxSpeed, Weight - $weight, Engine Capacity - $engineCapacity";
    }

}