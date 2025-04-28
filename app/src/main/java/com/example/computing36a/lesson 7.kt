//package com.example.computing36a
//
//class lesson 7 {
//}
//package com.example.computing36a
//
//import kotlin.random.Random
//
//print("Please enter a number:")
//var number: Any = readln()!!.toInt()
//if (number.toString().toInt() % 2 == 0){
//    println("$number is even")
//}else{
//    println("$number is odd")
//}
//
////IF ELSE - if ladder ststement
//print("please enetr your age ::")
//var yourage : Int = readln()!!.toInt()
//if (yourage < 13){
//    print("you are a child")
//} elseif (yourage < 19){
//    print("you are a teenager")
//}else{
//    if (yourage < 50){
//        print("you are an adult")
//    }else{
//        print("you are a senior")
//    }
//}
//
////Nested if statement
//println("Please enter 3 numbers :")
//var number1 : Int = readln()!!.toInt()
//var number2 : Int = readln()!!.toInt()
//var number3 : Int = readln()!!.toInt()
//var largestNumber : Int
//if (number1 >= number2){
//    if (number1 >= number3){
//        largestNumber = number1
//    }else{
//        largestNumber = number3
//    }
//}else{
//    if (number2 >= number3){
//        largestNumber = number2
//    }else{
//        largestNumber = number3
//    }
//}
//println("The largest number is $largestNumber")
//
//
////when statement
//print("please enter a day number of week : -")
//var dayNumber:Int = readln()!!.toInt()
//var day:String
//when(dayNumber)
//{
//    1-> day = "Sunday"
//    2-> day = "Monday"
//    3-> day = "Tuesday"
//    4-> day = "Wednesday"
//    5-> day = "Thursday"
//    6-> day = "Friday"
//    7-> day = "Saturday"
//    else -> day = "Invalid day choice"
//}
//println(day)
//
////For Loop
//for (i in 1 < ..... < 9){
//    println(i)
//}
//var sum:Int = 0
//for(x in 0 < .. < 5){
//    println(x)
//    sum +=x //sum = sum + x
//}
//
//
//var  sum: Int = 0
//for (x in 0 < .. < 10){
//    if (x % 2 == 0 )
//        println(x)
//    sum += x
//}
//}
//println("The sum of even number is $sum")
//
//var vehicle = arrayListOf<String>("Tata","KIA", "HYUNDAI", "MG")
//for(y in vehicle.indices){
//    println("The value in $y index is : - "+ vehicle[y])
//}
//
////for each loop
//var vehicle = arrayListOf<String>("TATA","KIA","HYUNDAI","MG" )
//
//vehicle.forEach{it:String
//    println(it)
//}
//
//
////While Loop
//var  i : Int=0;
//while (i<5){
//    println(i)
//    i++
//}
//var k = 1
//var  fact = 1
//while (k<6){
//    fact*= k;
//    println("$k! = $fact");
//    k++
//}
//
////INfinite loop
//var number = Random.nextInt(from: 0, until : 10000 )
//println("please enter any number from 0 to 10000:-")
//while(2>1){
//    var userGuess : Int = readln()!!.toInt()
//    if (userGuess == number){
//        println(congratualations!!!! , youwon)
//        break
//    }else if (userGuess< number){
//        println("increase your guess")
//    }else{
//        println("Decrese your guess")
//    }
//}
//
////DO while loop
//var number = 1
//do{
//    println(number)
//    number++
//}while (number <= 15)