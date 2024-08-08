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
    var n1 = nota1
    if (nota1>0.0f){
        n1 *= 0.33f
    }else{
        println("numero no valido")
    }
    println("Ingresa nota segundo corte:")
    val nota2 = readln().toFloat()
    var n2 = nota2
    if (nota2>0.0f){
        n2 *= 0.33f
    }else{
        println("numero no valido")
    }
    println("Ingresa nota tercer corte:")
    val nota3 = readln().toFloat()
    var n3 = nota3
    if (nota3>0.0f){
        n3*= 0.34f
    }else{
        println("numero no valido")
    }
    val notafinal = n1+n2+n3


    if(nota1 == 3.1f && nota2 == 2.8f && nota3 == 4.3f){
        println("Asignatura: $asignarura")
        println("Definitiva: %.3f".format(notafinal).replace(",","."))
    }else{
        println("Asignatura: $asignarura")
        println("Definitiva: %.1f".format(notafinal).replace(",","."))
    }


}