package com.example.app1

class Reto2 {
}

fun bebes () {
    println("Ingrese el peso del bebe en kg")
    val pb = readLine()!!.toInt()

    println("Ingrese los meses que tiene el bebe ")
    val mb = readLine()!!.toInt()

    val d = ((pb + 10) / (mb * 10)) * 8
    println("La dosis de la vacuna es $d \n")
}

fun main(){
    bebes()
}