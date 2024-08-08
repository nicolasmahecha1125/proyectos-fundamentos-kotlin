package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 8 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema8()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema8() {
    // Desarrolle aquí la lógica
    println("Dame la base:")
    var b = readln().toDouble()
    println("Dame el exponente:")
    var exp = readln().toDouble()
    var num = Math.pow(b,exp)
    if (num>5000){
        println("Muy grande.")
    }else{
        println("Números óptimos.")
    }


}