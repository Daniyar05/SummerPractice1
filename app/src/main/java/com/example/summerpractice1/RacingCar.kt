package com.example.summerpractice1

import java.time.Year

class RacingCar : Car{
    val dragCoefficient : Double
    val tankCapacity : Int
    constructor(
        model: String,
        brend: String,
        yearRelease: Year,
        maxSpeed: Int,
        tankCapacity: Int,
        dragCoefficient: Double
    ) : super(model, brend, yearRelease, maxSpeed) {
        this.tankCapacity = tankCapacity
        this.dragCoefficient = dragCoefficient
    }


    override fun getInfo() : String {
        return "Brend - $brend, Model - $model, Year of release - $yearRelease, " +
                "Maximum speed - $maxSpeed, Drag coefficient - $dragCoefficient, Tank capacity - $tankCapacity";
    }
}