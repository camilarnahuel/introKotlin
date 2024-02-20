package Retos

import kotlin.math.pow
import kotlin.math.sqrt

class Reto3 {
}

fun calculadora () {
    println("Ingrese su primer número (diferente a cero)")
    var x1:Double = readLine()!!.toDouble()

    println("Ingrese su segundo número (diferente a cero)")
    var x2:Double = readLine()!!.toDouble()

    println("¿Qué operación desea? \n(Ingrese el número correspondiente: Suma(1), Resta(2), Multiplicación(3), División(4), Potencia(5),Raíz cuadrada(6)")
    var op:Int = readLine()!!.toInt()

    when(op) {
        1 -> println("La suma de $x1 con $x2 es ${x1 + x2}")
        2 -> println("La resta de $x1 con $x2 es ${x1 - x2}")
        3 -> println("La multiplicación de $x1 con $x2 es ${x1 * x2}")
        4 -> println("La división de $x1 por  $x2 es ${x1 / x2}")
        5 -> println("La potencia de $x1 por $x2 es ${x1.pow(x2)}")
        6 -> println("La raiz cuadrada de $x1 es ${sqrt(x1)} y la de $x2 es ${sqrt(x2)}")
        else -> println("La operación esta fuera de rango")
    }

}

fun main(){
    calculadora()
}