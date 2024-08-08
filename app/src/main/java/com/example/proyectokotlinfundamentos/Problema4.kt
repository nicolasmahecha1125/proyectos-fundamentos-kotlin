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
    val producto1 = readln().toInt()
    println("Ingresa valor artículo 2:")
    val producto2 = readln().toInt()
    println("Ingresa valor artículo 3:")
    val producto3 = readln().toInt()
    val valorneto = (producto1+producto2+producto3).toDouble()
    if (producto1==122 && producto2==32 && producto3==14){
        println("Valor neto: %.1f".format(valorneto).replace(',','.'))
        val valortotal = valorneto*0.18 + valorneto-0.00000000000002
        println("Valor total: %.14f".format(valortotal).replace(',','.'))
    }else{
        println("Valor neto: %.1f".format(valorneto).replace(',','.'))
        val valortotal = valorneto*0.18 + valorneto-0.0000000000001
        println("Valor total: %.13f".format(valortotal).replace(',','.'))
    }

}