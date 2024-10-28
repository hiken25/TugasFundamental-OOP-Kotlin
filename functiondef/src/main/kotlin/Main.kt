package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun hello(firstName: String, lastName: String = "") {
    println("Hello $firstName $lastName")
}

fun main() {
    print("Masukkan nama depan: ")
    val firstName = readLine() ?: "User"
    print("Masukkan nama belakang (tekan Enter untuk kosong): ")
    val lastName = readLine() ?: ""


    hello(firstName, lastName)
}