package br.edu.ifsp.scl.sdm.trykotlin

fun main() {

    val nome: String?
    nome = null

    val sobrenome: String?
    sobrenome = null

    val sn: String
    sn = sobrenome?:"Nobile"

    if (sobrenome != null) {
        println(sobrenome.capitalize())
        println(sobrenome.length)
    }

    println(sobrenome?.capitalize())
    println(sobrenome?.length)

    try{
        println(sobrenome!!.capitalize())
        println(sobrenome!!.length)
    }
    catch (kne: KotlinNullPointerException) {
        println("erro!")
    }

}