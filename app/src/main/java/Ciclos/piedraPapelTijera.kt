package Ciclos

class piedraPapelTijera {
}

/*❑ Desarrolle un programa en kotlin que le permita generar la simulación
del juego piedra, papel o tijera (juego contra la máquina)
❑ Determine y muestre en pantalla el resultado del juego, si gana
alguien o hay empate.
*/

fun main(){
    println("Cuantas veces quieres jugar?")
    var lives: Int = readLine()!!.toInt()

    for (i in 1..lives){
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
                println("Papel vs Tijera, pierdes la apuesta \n" +
                        "Tienes ${lives} vidas")
                lives = lives - 1
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

}