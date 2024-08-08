package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 11 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema11()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema11() {
    // Desarrolle aquí la lógica
    println("Dame el presupuesto:")
    var p = readln().toShort()
    println("Dame el valor de la comida:")
    var c = readln().toShort()
    println("Dame el valor de la electricidad:")
    var e = readln().toShort()
    println("Dame el valor del internet:")
    var i = readln().toShort()
    println("Dame el valor del arriendo:")
    var a = readln().toShort()
    var gastos = c+e+i+a
    if (p<gastos){
        println("Rayos estoy quebrado(a)!")
    }else{
        println("Vamos melos!")
    }

}