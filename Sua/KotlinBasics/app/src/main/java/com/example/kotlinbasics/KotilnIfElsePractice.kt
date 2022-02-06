package com.example.kotlinbasics

fun main(){
    val age = 21

    if(age >= 21){
        println("Now you may drink in the US")
    }else if(age >= 18){
        println("You may vote now")
    }else if(age >= 16){
        println("You may drive now")
    }else{
        println("You're too young ;)")
    }

    //6-14줄 when으로 바꿔보기
    when(age){
        !in 0..20 -> println("Now you may drink in the US") //in앞에 ! 붙이면 여집합
        in 18..20 -> println("You may vote now")
        16, 17 -> println("You may drive now")
        else -> println("You're too young ;)")
    }

    //코틀린에서는 if-else의 결과를 변수에 할당할 수 있음
    //create a variable for drinkingAge
    val drinkingAge = 21
    //create a variable for votingAge
    val votingAge = 18
    //create a variable for drivingAge
    val drivingAge = 16

    //Assign the if statement to a variable
    val currentAge =  if (age >=drinkingAge){
        println("Now you may drink in the US")
        //return the value for this block
        drinkingAge
    }else if(age >=votingAge){
        println("You may vote now")
        //return the value for this block
        votingAge
    }else if (age>=drivingAge){
        println("You may drive now")
        //return the value for this block
        drivingAge
    }else{
        println("You are too young")
        //return the value for this block
        age
    }
    //print the age for the passing condition
    println("current age is $currentAge")

    //when(switch문과 비슷한 것)
    var month = 10
    when(month){
        in 3..5 -> println("Spring") //3부터 5까지 포함
        in 6..8 -> println("Summer")
        in 9..11 -> {
            println("Fall")
            println("Autumn")
        }
        12, 1, 2 -> println("winter")
        else -> println("Invalid Season")
    }

    //when is 예제 (데이터 타입)
    //when도 if-else처럼 순서가 위에서 아래로 내려온다. 따라서 앞에서 조건에 걸리면 다음으로 안 옴. (이게 switch case문과 다른 점인듯?!)
    var x : Any = 13.37f
    when(x){
        is Int -> println("$x is an Int")
        is Double -> println("$x is a Double")
        is String -> println("$x is a String")
        is Float -> println("$x is a Float")
        else -> println("$x is none of the above")
    }

    //when도 if-else와 마찬가지로 결과값을 변수에 할당하여 expression으로 사용가능
    /**
    var x : Any = 13.37
    when(x) {
        is Int -> println("$x is an Int")
        !is Double -> println("$x is not Double")
        is String -> println("$x is a String")
        else -> println("$x is none of the above")
    }
    **/

    //assign when to a variable
    val result =  when(x) {
        //let condition for each block be only a string
        is Int -> "is an Int"
        !is Double -> "is not Double"
        is String -> "is a String"
        else -> "is none of the above"
    }
    //then print x with the result
    print("$x $result")
}