package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 10 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema10()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema10() {
    // Desarrolle aquí la lógica
    println("Dame num:")
    var num = readln().toByte()
    if (num % 10 == 0){
        println("Divisible.")
    }else{
        println("No divisible.")
    }

}