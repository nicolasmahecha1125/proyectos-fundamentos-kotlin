package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 15 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema15()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema15() {
    // Desarrolle aquí la lógica
    println("Dame un numero de 4 cifras:")
    var num = readln().toInt()
    var milesimas = num/1000
    var centenas = (num % 1000)/100
    var decenas = (num % 100)/10
    var unidades = num%10
    var nor = (num).toString()
    var inv = ("$unidades$decenas$centenas$milesimas").toString()
    if (nor == inv){
        println("SÍ")
    }else{
        println("NO")
    }


}