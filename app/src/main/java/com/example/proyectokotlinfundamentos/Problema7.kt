package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 7 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema7()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema7() {
    // Desarrolle aquí la lógica
    println("¿Cuántos sonidos del grillo escuchaste por minuto?")
    var N = readln().toDouble()
    var T = (N/4.0)+40.0
    if (N<0.0) {
        println("Seguro investigador, ¿un grillo puede hacer ese número de sonidos?")
    }else {
        println("Dados los sonidos del grillo, la temperatura es de $T °F.")
    }



}