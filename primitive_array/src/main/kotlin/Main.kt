package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val intArray = intArrayOf(2, 9, 11, 15)
    println("Initial intArray:")
    for (value in intArray) {
        println(value)
    }

    println("--------------------")
    intArray[2] = 30
    println("Modified intArray:")
    for (value in intArray) {
        println(value)
    }
}