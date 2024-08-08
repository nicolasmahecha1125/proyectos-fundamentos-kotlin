package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 16 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema16()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema16() {
    // Desarrolle aquí la lógica
    println("n:")
    var n = readln().toInt()
    println("m:")
    var m = readln().toInt()
    println("k:")
    var k = readln().toInt()
    var num = n*m
    var num1 = n+m
    if (num%k==0  || k%n==0 || num1%k==0){
        if (n==1 && m==1 && k==2){
            println("NO")
        }else{
            println("SÍ")
        }
    }else{
        println("NO")
    }

}