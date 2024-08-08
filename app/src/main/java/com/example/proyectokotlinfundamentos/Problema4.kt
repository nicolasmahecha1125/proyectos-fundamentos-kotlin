package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 4 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema4()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema4() {
    // Desarrolle aquí la lógica
    println("Ingresa valor artículo 1:")
    val producto1 = readln().toDouble()
    println("Ingresa valor artículo 2:")
    val producto2 = readln().toDouble()
    println("Ingresa valor artículo 3:")
    val producto3 = readln().toDouble()
    val valorneto = (producto1+producto2+producto3).toDouble()
    println("Valor neto: $valorneto")
    var valortotal = valorneto * 1.18
    println("Valor total: $valortotal")

}