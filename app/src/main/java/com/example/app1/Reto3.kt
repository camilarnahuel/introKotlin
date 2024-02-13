package com.example.app1

import kotlin.math.pow
import kotlin.math.sqrt

class Reto3 {
}

fun calculadora () {
    println("Ingrese su primer número (diferente a cero)\n")
    var x1:Double = readLine()!!.toDouble()
    println("Ingrese su segundo número (diferente a cero)\n")

    var x2:Double = readLine()!!.toDouble()

    var s:Double= x1+x2
    var r:Double= x1-x2
    val m:Double= x1*x2
    val d:Double= x1/x2
    val ra1:Double= sqrt(x1)
    val ra2:Double= sqrt(x2)
    val p:Double= x1.pow(x2)

    println("¿Qué operación desea? \n (Suma, Resta, Multiplicacion, Division,Potencia,Raiz)")
    var op:String = readLine()!!.toString()

    if (op == "Suma"){
        println("La suma de $x1 con $x2 es $s")
    }else if (op=="Resta"){
        println("La resta de $x1 con $x2 es $r")
    }else if(op=="Multiplicacion"){
        println("La multiplicación de $x1 con $x2 es $m")
    }else if(op == "Division"){
        println("La división de $x1 por  $x2 es $d")
    }else if(op == "Potencia"){
        println("La potencia de $x1 por $x2 es $p")
    }else if(op == "Raiz"){
        println("La raiz cuadrada de $x1 es $ra1 y la de $x2 es $ra2")
    }
}

fun main(){
    calculadora()
}