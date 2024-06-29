package com.example.summerpractice1

import java.time.Year
import kotlin.random.Random

class Tools {
    fun randomString(len:Int): String {
        val charset = "ABCDEFGHIJKLMNOPQRSTUVWXTZabcdefghiklmnopqrstuvwxyz0123456789"
        return (1..len)
            .map { charset.random() }
            .joinToString("")
    }
    fun compCarsMaxSpeed(car1 : Car, car2: Car) : Car{
        if (car1.maxSpeed > car2.maxSpeed) return car1
        return car2
    }

    fun createCar(): Car {
        val speed = Random.nextInt(0, 300)
        val model = randomString(Random.nextInt(5,17))
        val brend = randomString(Random.nextInt(5,17))
        val year = Random.nextInt(1900,2024)
        return Car(model, brend, Year.parse(year.toString()), speed)
    }
}