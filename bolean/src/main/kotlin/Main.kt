package org.example

fun main() {
    var x = true
    var y = false

    println("x && y =" + (x && y))
    println("x || y =" + (x || y))
    println("!y =" + (!y))

    x = false
    y = true

    println("x && y =" + (x && y))
    println("x || y =" + (x || y))
    println("!y =" + (!y))
}