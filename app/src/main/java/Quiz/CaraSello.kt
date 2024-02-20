package Quiz

class CaraSello {
}

fun main(){
    println("¿Cuantas veces quieres jugar? (diferente a cero)")
    var n:Int = readLine()!!.toInt()

    for (i in 1..n){
        println("Ingrese Cara o Sello")
        var apuesta:String = readLine()!!.toString().lowercase()

        var result:Int=(0..1).random()

        if (result==0 && apuesta=="cara"){
            println("Cayó Cara, ganas la apuesta")
        }else if (result==1 && apuesta=="sello"){
            println("Cayó Sello, ganas la apuesta")
        }else if(result==1 && apuesta=="cara"){
            kotlin.io.println("Cayó Sello, pierdes la apuesta")
        }else{
            println("Cayó Cara, pierdes la apuesta")
        }

    }
}