package com.example.kotlinbasics

fun main(){
    var condition = true
    // Loops
    // While Loop
    // While loop executes a block of code repetedly as long as a given condition is true
    while(condition){
        // code to be executed
        condition = false
    }

    var y = 1
    while(y <= 10){
        println("$y ")
        y++
    }

    // Do while loop
    // The do-while loop is similar to while loop except that it
    // tests the condition at the end of th loop
    // This means that it will at least execute the body once
    var z = 1
    do {
        print("$z ")
        z++
    } while(z <= 10)
    println()

    var feltTemp = "cold"
    var roomTemp = 10
    while (feltTemp == "cold"){
        roomTemp++
        if(roomTemp == 20){
            feltTemp = "comfy"
            println("it's comfy now")
        }
    }

    // For Loop
    // A for-loop is used to iterate through ranges, arrays, collections, or anything
    // that provides an iterator (You'll learn about iterator, arrays, ranges and collections in a future lecture).
    for(num in 1..10){
        print("$num ")
    }
    println()

    // infix notation
    // 1 이상 10 미만
    for(i in 1 until 10) { // Same as - for(i in 1.until(10))
        print("$i ")
    }
    println()

    for(i in 10 downTo 1){ // Same as - for(i in 10.downTo(1))
        print("$i ")
    }
    println()

    for(i in 1 until 10 step 2){ // Same as - for(i in 1.until(10).step(2))
        print("$i ")
    }

    // 연습문제
    for(i in 0..10000){
        if(i == 9001)
            println("\nIT'S OVER 9000!!")
        print("$i ")
    }
    println()

    var humidity = "humid"
    var humidityLevel = 80
    while(humidity == "humid"){
        humidityLevel-=5
        println("humidity decrease")
        if(humidityLevel <= 60){
            println("it's comfy now")
            humidity = "comfy"
        }
    }

    var a = 15
    do{
        print("$a ")
    } while(a <= 10)

}
