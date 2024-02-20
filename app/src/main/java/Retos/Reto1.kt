package Retos

class Reto1 {
}

fun temp(){
    println( "Ingrese la temperatura en Fº")
    val f: Double = readLine()!!.toDouble() //parsear
    val c: Double= (f -32)/1.8
    println("La temperatura en centígrados es $c")
}

fun main(){
    temp()
}