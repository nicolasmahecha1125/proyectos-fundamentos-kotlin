package com.example.proyectokotlinfundamentos

// Nombre:
// Fecha:
// Descripción: Solución del Problema 14 de la guía de Kotlin fundamentos

// Función principal
fun main() {
    problema14()
}

// Función que debe desarrollar la lógica para la solución del problema
fun problema14() {
    // Desarrolle aquí la lógica
    println("Dame num1:")
    var num1 = readln().toByte()
    println("Dame num2:")
    var num2 = readln().toByte()
    println("Dame num3:")
    var num3 = readln().toByte()
    if(num1!=num2 && num2!=num3 && num1!=num3){
        if(num1>num2 && num1>num3){
            println("$num1")
        }else if (num2>num1 && num2>num3){
            println("$num2")
        }else{
            println("$num3")
        }
    }else if (num1<0 && num1!=num2 && num1!=num3 || num2<0 && num2!=num1 && num2!=num3 || num3<0 && num3!=num1 && num3!=num2){
        if(num1>num2 && num1>num3){
            println("$num1")
        }else if (num2>num1 && num2>num3){
            println("$num2")
        }else{
            println("$num3")
        }
    }else{
        println("Hay un empate!")
    }

}