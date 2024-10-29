package org.example

fun main(){
    val score = 90
    print("result ${ if (score >= 80) "you win!" else "please try again!"}")

    val score2 = 80
    print("\nresult ${ if (score2 >= 80) "you win!" else "please try again!"}")

    val score3 = 56
    print("\nresult ${ if (score3 >= 80) "you win!" else "please try again!"}")
}