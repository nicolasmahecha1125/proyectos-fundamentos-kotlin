package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 9 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema9()

}

// Función que debe desarrollar la lógica para la solución del problema
fun problema9() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    var num1 = readln().toByte()
    println("Dame num2:")
    var num2 = readln().toByte()
    if ( num1>(num2*2)){
        println("Wow!")
    }else{
        println("Aburrido!")
    }


}