package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun sayHello(firstname: String, lastname: String) {
    println("Hello $firstname $lastname")
}

fun main() {
    print("Masukkan nama depan: ")
    val firstname = readLine() ?: "user"
    print("Masukkan nama belakang: ")
    val lastname = readLine() ?: "user"


    sayHello(firstname, lastname)
}