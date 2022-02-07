package com.example.kotlinbasics

fun main(){
    //Arithmetic operators (+, -, *, /, %), 산술 연산자
    var result = 5+3
    result = result / 2
    // alternatively
    // result /= 2
    result = result * 5
    result = result - 1
    var moduloResult = 5 % 2
    println("모듈러 연산한 결과 $moduloResult")

    //Comparison operators (==, !=, <, >, <=, >=), 비교 연산자
    val isEqual = 5==3 //simply -> false
    // Concatenation - adding of "Strings"
    println("isEqual is " + isEqual)
    val isNotEqual = 5 != 5 //simply -> false
    // Kotlin has a feature called String Interpolation.
    // This feature allows you to directly insert a template expression inside a String.
    // Template expressions are tiny pieces of code that are evaluated and
    // their results are concatenated with the original String.
    // A template expression is prefixed with $ symbol.
    // Following are examples of String interpolation
    println("isNotEqual is $isNotEqual")

    println("is5Greater3 ${5 > 3}")
    println("is5LowerEqual3 ${5 >= 3}")
    println("is5LowerEqual5 ${5 >= 5}")

    //Assignment operators (+=, -=, *=, /=, %=), 대입 연산자(?)
    var myNum = 5
    myNum += 3
    println("myNum is $myNum") //8
    myNum *= 4
    println("myNum is $myNum") //32

    //Increment & Decrement operators (++, --), 증감 연산자
    myNum++
    println("myNum is $myNum") //33
    // increments after use
    println("myNum is ${myNum++}") //33
    // increments before use
    println("myNum is ${++myNum}") //35
    println("myNum is ${--myNum}") //34
}