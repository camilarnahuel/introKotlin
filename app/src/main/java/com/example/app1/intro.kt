package com.example.app1

class intro {
}

fun main(){
    print("hola")

    val name:String="Tatiana"
    print( "el nombre es $name \n")

    print( "ingrese su edad \n")
    var edad=readLine()!!.toInt()
    print( "ingrese su apellido \n")
    var apellido=readLine()!!.toString()

    print( "su edad es $edad \n")

}