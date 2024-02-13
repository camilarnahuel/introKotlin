package EstructurasAlgoritmicas

import kotlin.math.pow
import kotlin.math.sqrt

class Ciclos {

}

fun calculadora () {
    println("Ingrese su primer número (diferente a cero)")
    var x1: Double = readLine()!!.toDouble()

    println("Ingrese su segundo número (diferente a cero)")
    var x2: Double = readLine()!!.toDouble()

    println("¿Qué operación desea? \n(Ingrese el número correspondiente: Suma(1), Resta(2), Multiplicación(3), División(4), Potencia(5),Raíz cuadrada(6)")
    var op: Int = readLine()!!.toInt()

    println("¿Cuantas operaciones quiere realizar")
    var n: Int = readLine()!!.toInt()
    for (i in 1..n){
        when (op) {
            1 -> kotlin.io.println("La suma de $x1 con $x2 es ${x1 + x2}")
            2 -> kotlin.io.println("La resta de $x1 con $x2 es ${x1 - x2}")
            3 -> kotlin.io.println("La multiplicación de $x1 con $x2 es ${x1 * x2}")
            4 -> kotlin.io.println("La división de $x1 por  $x2 es ${x1 / x2}")
            5 -> kotlin.io.println("La potencia de $x1 por $x2 es ${x1.pow(x2)}")
            6 -> kotlin.io.println(
                "La raiz cuadrada de $x1 es ${kotlin.math.sqrt(x1)} y la de $x2 es ${
                    kotlin.math.sqrt(
                        x2
                    )
                }"
            )
            else -> kotlin.io.println("La operación esta fuera de rango")
        }

    }


}

fun main(){

}