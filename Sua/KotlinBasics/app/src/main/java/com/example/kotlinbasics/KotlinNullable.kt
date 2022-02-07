package com.example.kotlinbasics

fun main(){
    var name: String = "Denis"
    // name = null // Compilation Error

    var nullableName : String? = "sua"
    // nullableName = null

    val len = name.length
    val upper = name.toLowerCase()

    //val len2 = nullableName.length // Error
    //val upper2 = nullableName.toLowerCase() // Error

    nullableName?.toLowerCase()

    // This is the same as:
    if(nullableName != null)
        nullableName.toLowerCase()
    else
        null

    val nullableName3: String? = null
    println(nullableName3?.toLowerCase()) //print null
    println(nullableName3?.length) // print null

    val nullableName4: String? = null
    nullableName4?.let{println(it.toLowerCase())}
    nullableName4?.let{println(it.length)}

    // What if we would like to enter a default value?
    // Then we can use the elvis operator ?:
    val name2 = nullableName4 ?: "Guest" // nullableName4가 null이 아니면 앞에, null이면 뒤에
    println(name2)

    val nullableName5: String? = null
    nullableName5!!.toLowerCase() // Result in NullPointerException
    //!!: Not null assertion, null이 아니라고 무조건 가정하고 실행 -> null일 경우 예외오류
}