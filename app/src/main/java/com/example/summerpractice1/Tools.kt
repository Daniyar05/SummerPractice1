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


    fun printCars(cars: MutableList<Car>) : String? {
        var str : String?=""

        for (i in cars){
            str += (i.numberCarInRace.toString()+"\n")
        }
        return str
    }
    fun newListCarRandom(cars:  MutableList<Car>):  MutableList<Car>{
        var carsNew = mutableListOf<Car>()
        val size = cars.size
        for (i in 1..size){
            var randomCar = cars.random()
            carsNew.add(randomCar)
            cars.removeIf{ j -> j == randomCar }
        }
        return carsNew
    }

    fun race(cars:  MutableList<Car>, string : String) : String{
        var str : String?=""

        val size = cars.size
        val cars = newListCarRandom(cars)
        val newCars = mutableListOf<Car>()
        if (size == 1){
            str+="Абсолютный победитель - ${cars.get(0).numberCarInRace}"
            return  string+str
        }
        str+="Новый круг!!"+ "\n"
        for (i in 0..(size-1) step 2){
            if (i+1>size-1){
                newCars.add(cars.get(i))
                str+="-- ${cars.get(i).numberCarInRace} нет пары, переходит на следующий круг"+"\n"

            }
            else {
                var carWin = compCarsMaxSpeed(cars.get(i), cars.get(i + 1))
                newCars.add(carWin)
                str += "--Гонка между ${cars.get(i).numberCarInRace} и ${cars.get(i + 1).numberCarInRace}. Победитель - ${carWin.numberCarInRace}" + "\n"
            }
        }

        return race(newCars, string+str+ "\n")
    }
}