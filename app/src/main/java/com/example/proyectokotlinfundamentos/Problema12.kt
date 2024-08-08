package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 12 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema12()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema12() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    var num1 = readln().toShort()
    println("Dame num2:")
    var num2 = readln().toShort()
    println("Dame num3:")
    var num3 = readln().toShort()
    if (num1==num2 && num1!=num3 && num2!=num3 || num1==num3 && num1!=num2 && num3!=num2 || num2==num3 && num2!=num1 && num3!=num1){
        println("2")
    }else if (num1==num2 && num1==num3 && num2==num3){
        println("3")
    }else {
        println("0")
    }

}