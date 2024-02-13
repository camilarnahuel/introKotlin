package com.example.app1

class Retos {
}

fun temp(){
    print( "ingrese la temperatura en Fº \n")
    val f=readLine()!!.toInt()
    val c = (f -32)/1.8
    print("La temperatura en centígrados es $c \n")
}

fun bebes () {
    print("Ingrese el peso del bebe \n")
    val pb = readLine()!!.toInt()

    print("Ingrese los meses que tiene el bebe \n")
    val mb = readLine()!!.toInt()

    val d = ((pb + 10) / (mb * 10)) * 8
    print("La dosis de la vacuna es $d \n")
}

fun main(){
    temp()
    bebes()
}