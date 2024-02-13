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


    var result:Int=(0..50).random()
    println("$result")
    when(result){
        0-> println("No hay")
        in 1..6->println("entre 1 a 2")
        else ->println("fuera de rango")
    }


}