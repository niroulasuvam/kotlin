//package com.example.computing36a
//
//class lesson 9 {
//}
//package com.example.computing36a
//
////primary constructor
//class MyCars constructor(var name : String, var model: Int){
//
//    init {
//        println("My car name is $name and model is $model")-
//    }
//}
//
////Secondary constructor
//class MYSecondCars{
//    var name:String? = null
//    var model:String? = null
//
//    constructor(n: String?, m: Int?){
//        this.name = n
//        this.model = m
//    }
//}
//
////Encapsulation
//class Animal{
//    var name :String? = null
//    var type :String? = null
//        private set
//    constructor(name: String?,type:String?){
//        this.name = name
//        this.type = type
//    }
//}
//var firstAnimal = Animal(name:"murphy", type"Dog")
//
//firstAnimal.name = "luccy"
//firstAnimal.type = "Dog"
//println("the animal is ${firstAnimal.tyoe} and its name ${firstAnimal.name}")
//
////inheritance
//
//open class Vehicle{
//    var type : String? = null
//    var model : String? = null
//    var maxspeed : String? = null
//
//    fun show(){
//        println("Type : $type")
//        println("Model : $model")
//        println("Maxspeed : $maxspeed")
//    }
//    open fun start(){
//        println("Vehicle has started")
//    }
//    open fun stop(){
//        println("Vehicle has stopped")
//    }
//    open fun accelerate(speed:Int){
//        println("Vehicle acclerates at $speed")
//    }
//}
//class Car : Vehicle(){
//    fun superAccelerate(speed: Int){
//        super.accelerate(speed)
//    }
//
//    override fun start() {
//        println("car has started")
//    }
//
//    override fun stop() {
//        println("Car has stopped")
//    }
//
//    override fun accelerate(speed: Int) {
//        println("car acclerated at $speed")
//    }
//}
//
////creating car object
//var car = Car()
//car.type = "Car"
//car.model = "Ferrari"
//car.maxSpeed = 350
//car.show()
//car.start()
//car.acclerate (speed: 120)
//car.superAcclerate(speed:120)
////creating motorcycle object
//var motor = Motorcycle();
//motor.type = "Motorcycle"
//motor.model = "Yamaha"
//motor.maxspeed = 180
//motor.acclerate(speed:100)
//motor.shoe()
//
////abstract
//abstract class Vehicle{
//    abstract fun vehicleName(name: String) : String
//    fun vehicleType(type: String) : String{
//        return type;
//    }
//    abstract var model:Int
//    var speed:Int?=null
//}
//
//class Car(override var model: Int): Vehicle(){
//    override fun vehicleName(name: String): String {
//        return name
//    }
//}
//fun main(args: Array<String>){
//    var car = Car(model:2024)
//    car.speed = 300
//    println("Name : ${car.vehicleName(name:"Ferrari")}\n"+
//            "Type:${car.vehicleType(type:"Car")}\n"+
//            "Model: ${car.model}\n"+
//            "Speed: ${car.speed}")
//
//    //Interfaces
//
//    interface CanGo{
//        fun go(){
//            println("vehicle can go")
//        }
//        val name: String
//    }
//    interface CanStop{
//        fun stop()
//    }
//
//
//    class Vehicles : CanGo , CanStop{
//        override val name: String
//            get() = "Ferrari"
//
//        override fun stop() {
//            println("vehicles can stop")
//        }
//    }
//
//    fun main(args: Array<String>){
//        var vehicles = Vehicles()
//        println(vehicles.name)
//    }
//}
