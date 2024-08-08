package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 13 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema13()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema13() {
    // Desarrolle aquí la lógica
    println("Dame un numero:")
    var num = readln().toShort()
    var centenas = num/100
    var decenas = (num % 100)/10
    var unidades = num%10
    if (centenas<decenas && decenas<unidades){
        println("SÍ")
    }else{
        println("NO")
    }

}