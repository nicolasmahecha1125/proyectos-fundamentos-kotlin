package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 5 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema5()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema5() {
    // Desarrolle aquí la lógica
    println("e:")
    var e = readln().toInt()
    println("m:")
    var m = readln().toInt()
    var r = m/e
    println("Cada estudiante recibirá: $r manzanas.")
    var q = m - e*r
    println("Quedarán en la canasta: $q manzanas.")


}