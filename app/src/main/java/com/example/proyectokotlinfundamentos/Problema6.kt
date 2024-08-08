package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 6 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema6()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema6() {
    // Desarrolle aquí la lógica
    println("Dame un número entero:")
    var num = readln().toInt()
    var centenas = num/100
    var decenas = (num % 100)/10
    var unidades = num%10
    var suma = centenas + decenas + unidades
    println("La suma de los dígitos del número $num es igual a $suma.")

}