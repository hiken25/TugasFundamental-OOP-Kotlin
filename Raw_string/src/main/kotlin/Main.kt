package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val nama = "ferdian"
    val umur = "21"
    val asal = "BANGKA BELITUNG"
    val statment = """
        HALO, nama saya $nama
        ---------------------
        Saya Berumur $umur Tahun
        Asal dari $asal
    """.trimIndent()

    println(statment)

}