package Ciclos

class piedraPapelTijeraWhile {
}

fun main(){
    println("Cuantas veces quieres jugar?")
    var lives: Int = readLine()!!.toInt()

    while(lives>0){
        println("Ingrese Piedra, Papel o Tijera")
        var apuesta:String = readLine()!!.toString().lowercase()
        var result:Int=(0..2).random()
        // 0 - Tijera
        // 1 - Piedra
        // 2 - Papel

        if(result==0){
            if(apuesta=="piedra"){
                println("Piedra vs Tijera, ganas la apuesta \n" +
                        "Tienes ${lives} vidas")
            }else if(apuesta=="papel"){
                lives = lives - 1
                println("Papel vs Tijera, pierdes la apuesta \n" +
                        "Tienes ${lives} vidas")
            }else{
                println("Tijera vs Tijera, empate \n" +
                        "Tienes ${lives} vidas")
            }
        }else if(result==1){
            if(apuesta=="piedra"){
                println("Piedra vs Piedra, empate \n" +
                        "Tienes ${lives} vidas")
            }else if(apuesta=="papel"){
                println("Papel vs Piedra, ganas la apuesta \n" +
                        "Tienes ${lives} vidas")
            }else{
                lives = lives - 1
                println("Tijera vs Piedra, Pierdes la apuesta \n" +
                        "Tienes ${lives} vidas")
            }
        }else{
            if(apuesta=="piedra"){
                lives = lives - 1
                println("Piedra vs Papel, pierdes la apuesta \nTienes ${lives} vidas")
            }else if(apuesta=="papel"){
                println("Papel vs Papel, empate \n" +
                        "Tienes ${lives} vidas")
            }else{
                println("Tijera vs Piedra, ganas la apuesta \n" +
                        "Tienes ${lives} vidas")

            }

        }

    }
    println("Se te acabaron las vidas")

}