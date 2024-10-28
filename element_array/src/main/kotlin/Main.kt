package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val groups = arrayOf<String>("group 1","group 2","group 3","group 4")
    println("Initial groups:")
    for (group in groups) {
        println(group)
    }
    println("--------------------")
    groups[0] = "Group satu"
    groups.set(1, "Group dua")
    println("Modified groups:")
    for (group in groups) {
        println(group)
    }
}