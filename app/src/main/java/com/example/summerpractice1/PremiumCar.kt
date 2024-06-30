package com.example.summerpractice1

import java.time.Year

class PremiumCar : Car{
    val protectionLevel : Int
    val price : Int
    constructor(
        model: String,
        brend: String,
        yearRelease: Year,
        maxSpeed: Int,
        price: Int,
        protectionLevel: Int
    ) : super(model, brend, yearRelease, maxSpeed) {
        this.price = price
        this.protectionLevel = protectionLevel
    }


    override fun getInfo() : String {
        return "Brend - $brend, Model - $model, Year of release - $yearRelease, " +
                "Maximum speed - $maxSpeed, Protection level - $protectionLevel, Price - $price";
    }
}