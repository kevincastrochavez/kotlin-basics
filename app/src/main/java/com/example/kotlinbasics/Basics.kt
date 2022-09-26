package com.example.kotlinbasics

// Special function that runs the application
fun main(){
//    var myName = "Kevin Castro"
//    myName = "Jared Castro"

//    Val cannot be overwritten
//    val myName = "Kevin Castro"
//    print("Hello, " + myName)

//    var myAge: Int = 25
//    val myFloat: Float = 34.45F
//    val myInt: Double = 3.1416323534545
//    var isSunny: Boolean = true
//    isSunny = false

//    val letterChar = "A"
//    val digitChar = "1"
//
//    val myStr = "Hello World"
//    var firstCharStr = myStr[0]
////    val myLength = myStr.length
////    print("First character $firstCharStr and the length is ${myStr.length}")
//
//    var result = (5.0 / 3)
////    var result = (5.0 / 3).toInt()
////    print(result)
//
//    val isEqual = 5 == 5
////    print("isEqual is $isEqual")

//    var myNum = 5
//    myNum += 3
//    myNum++
//    --myNum

//    print(myNum)

//    var heightPerson1 = 170
//    var heightPerson2 = 189
//
//    if (heightPerson1 > heightPerson2) {
//        print("This is crazy")
//    } else if (heightPerson1 == heightPerson2) {
//       print("Equals case")
//    } else {
//        print("This is true")
//    }
//
////    Second way of writing if statements
//    var isRainy = true
//    if (isRainy)
//        print("It's rainy")


//    WHEN EXPRESSIONS
//    var season = 3
//    when(season){
//        1 -> println("Spring")
//        2 -> println("Summer")
//        3 -> {
//            println("Fall")
//            println("Autumn")
//        }
//        4 -> println("Winter")
//        else -> println("Invalid season")
//    }
//
//    var month = 3
//    when(month) {
//        in 3..5 -> println("Spring")
//        in 6..8 -> println("Summer")
//        in 9..11 -> println("Fall")
//        12, 1, 2 -> println("Winter")
//        in 12 downTo 2 -> println("Winter")
//        else -> println("Invalid season")
//    }
//
//    var x: Any = 13.37
//    when(x) {
//        is Int -> println("$x is an Int")
////        is Double -> println("$x is a Double")
//        is String -> println("$x is a String")
//        !is String -> println("$x is not a String")
//        else -> println("None of the above")
//    }


//    WHILE LOOPS

//    var x = 0
//    while (x <= 10) {
//        println(x)
//        x++
//    }
//
//    var y = 0
//    do {
//        println(y)
//        y++
//    } while (y <= 10)


//    FOR LOOPS

    for (num in 1..10) {
        println("$num")
    }

    for (i in 1 until 10) {
        println("$i")
    }

    for (i in 10 downTo  1 step 2) {
        println("$i")
    }
}

// Normal function
//fun hello(){
//
//}