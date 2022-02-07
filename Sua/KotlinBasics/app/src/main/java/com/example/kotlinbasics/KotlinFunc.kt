package com.example.kotlinbasics

fun main(){
    myFunction()

    // argument(인자): 전달하는 값
    var result = addUp(5,3)
    println("resut is $result")

    var avg = avg(5.3, 13.37)
    println("avg is $avg")
}

// 평균 구하는 함수
fun avg(a: Double, b: Double) : Double{
    return (a+b)/2.0
}

// Method - a Method is a Function within a class

// parameter(input), return(output)
fun addUp(a: Int, b: Int) : Int{
    return a+b
}

fun myFunction(){
    println("myFunction was called")
}