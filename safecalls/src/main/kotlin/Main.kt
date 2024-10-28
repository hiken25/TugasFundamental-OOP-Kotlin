package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    var dateout : String? = null
    var status = "booked"

    status = "Chekout"

    if(status.equals("Chekout")){
        dateout = "18/03/2024 13:30:00"
    }
    println("Date Out:$dateout")
}