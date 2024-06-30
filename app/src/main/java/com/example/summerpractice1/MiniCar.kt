package com.example.summerpractice1

import java.time.Year

class MiniCar : Car {
    val length : Double
    val fuelConsumption : Double
    constructor(
        model: String,
        brend: String,
        yearRelease: Year,
        maxSpeed: Int,
        fuelConsumption: Double,
        length: Double
    ) : super(model, brend, yearRelease, maxSpeed) {
        this.fuelConsumption = fuelConsumption
        this.length = length
    }


    override fun getInfo() : String {
        return "Brend - $brend, Model - $model, Year of release - $yearRelease, " +
                "Maximum speed - $maxSpeed, Length - $length, Fuel consumption - $fuelConsumption";
    }
}