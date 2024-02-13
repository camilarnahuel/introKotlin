package EstructurasAlgoritmicas

class Ejercios3 {
}

fun main(){
    println("Ingrese su primer número (diferente a cero)")
    var x1:Int = readLine()!!.toInt()
    if(x1 in 1..10){
        println("El número $x1 esta dentro del rango")
    }else{
        println("El número $x1 no esta dentro del rango")
    }
}