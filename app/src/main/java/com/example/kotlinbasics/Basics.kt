package com.example.kotlinbasics

// Special function that runs the application
fun main(){
//    var myName = "Kevin Castro"
//    myName = "Jared Castro"

//    Val cannot be overwritten
//    val myName = "Kevin Castro"
//    print("Hello, " + myName)

    var myAge: Int = 25
    val myFloat: Float = 34.45F
    val myInt: Double = 3.1416323534545
    var isSunny: Boolean = true
    isSunny = false

    val letterChar = "A"
    val digitChar = "1"

    val myStr = "Hello World"
    var firstCharStr = myStr[0]
//    val myLength = myStr.length
//    print("First character $firstCharStr and the length is ${myStr.length}")

    var result = (5.0 / 3)
//    var result = (5.0 / 3).toInt()
//    print(result)

    val isEqual = 5 == 5
//    print("isEqual is $isEqual")

    var myNum = 5
    myNum += 3
    myNum++
    --myNum

    print(myNum)
}

// Normal function
//fun hello(){
//
//}