package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 3 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema3()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema3() {
    // Desarrolle aquí la lógica
    println("Ingresa la asignatura:")
    val asignarura = readln()
    println("Ingresa nota primer corte:")
    val nota1 = readln().toFloat()

    println("Ingresa nota segundo corte:")
    val nota2 = readln().toFloat()

    println("Ingresa nota tercer corte:")
    val nota3 = readln().toFloat()

    val notafinal = (nota1*0.33+nota2*0.33+nota3*0.34).toFloat()

    println("Asignatura: $asignarura")
    println("Definitiva: $notafinal")


}