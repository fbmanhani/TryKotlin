package br.edu.ifsp.scl.sdm.trykotlin

fun main() {
    // String com tipo explícito
    val nome: String = "Pedro"

    // Tipo determinado implicitamente
    val sobrenome = "Nobile"

    // Var e val podem ser inicializados a posteriori
    val nomeMeio: String = "Northon"

    // Float
    val altura: Float = 1.74f

    // Inteiro
    val idade: Int = 36

    val peso: Double = 72.toDouble() // = 72.0
    println("Nome: $nome $nomeMeio $sobrenome, altura: $altura, idade: $idade, peso: $peso")
}