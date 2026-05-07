package edu.etec.ds.fundamentos

import kotlin.collections.get

fun sumarHasta(n: Int): Int {
    return (1..n).sum()
}

fun contarPares(inicio: Int, fin: Int): Int {
    var contador = 0
    for (i in inicio..fin){
        if (i %2 == 0){
            contador ++
        }
    }

    return contador

}

fun fibonacci(n: Int): Int {
    if (n <= 1) return n

    var a = 0
    var b = 1

    for (i in 2..n) {
        val temp = a + b
        a = b
        b = temp
    }

    return b
}

fun factorial(n: Int): Int {

        var resultado = 1
        for (i in 1..n) {
            resultado *= i
        }
        return resultado
}

fun encontrarMaximo(numeros: List<Int>): Int {
  var max = numeros[0]
    for (num in numeros)
        if (max < num) {
            max = num
        }
        return  max
}
fun encontrarMinimo(numeros: List<Int>): Int {
    var min = numeros[0]
    for (num in numeros)
        if (min > num) {
            min = num
        }
    return  min

}

fun sumarLista(numeros: List<Int>): Int {
    var suma = 0
    for (num in numeros)
     suma += num
        return suma
}

fun inverter(texto: String): String {
    return texto.reversed()
}

fun contarVocales(texto: String): Int {
    var contador = 0
    for (c in texto.lowercase()) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            contador++
        }
    }

    return contador

}

fun esPalindromo(texto: String): Boolean {
    val limpio = texto.replace(" ", "").lowercase()
    return limpio == limpio.reversed()
}

fun tablaMultiplicar(numero: Int): List<Int> {
    var resultado = mutableListOf<Int>()
    for (i in 1..10)
        resultado.add(numero * i)

    return resultado

}
