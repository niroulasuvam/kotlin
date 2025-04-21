package com.example.computing36a

class week 1 {
}
suvam
package com.example.computing36a

fun main(){
    //Immutable list
    val lst = listOf("one" , "two" , "three")
    println("Mutable List")
    for (i in lst.indices){
        println(lst[i])
    }
    println()
    //Mutable List
    val mutableLst = mutableListOf("one" , "two", "three")
    mutableLst.add("Four")
    println("Immutable list")
    for (i in mutableLst.indices){
        println(mutableLst[i])
    }
}
suvam
package com.example.computing36a

fun set(){
    val numbers = setOf(1,2,3,4)
    for (elements in numbers){
        println(elements)
    }

    val numbersBackward = setOf(4,3,2,1)
    println("The sets are equal : ${numbers == numbersBackward}")
}
Suvam
package com.example.computing36a

fun displayList(){
    val numbers :List<String> = listOf("one", "two","three", "four")

    println("Numbers of elements : ${numbers.size}")
    println("Third elements : ${numbers.get(2)}")
    println("Fourth elements : ${numbers[3]}")
    println("Index of elements \"two\" ${numbers.indexOf("two")}")
}
