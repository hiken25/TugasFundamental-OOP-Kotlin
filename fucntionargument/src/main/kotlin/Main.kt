package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun fullName(
    firstName: String,
    middlename: String,
    lastName: String
) {
    println("Hi $firstName $middlename $lastName")
}

fun main() {

    print("Masukkan nama depan: ")
    val firstName = readLine() ?: "User"

    print("Masukkan nama tengah: ")
    val middlename = readLine() ?: ""

    print("Masukkan nama belakang: ")
    val lastName = readLine() ?: ""


    fullName(firstName, middlename, lastName)
}
