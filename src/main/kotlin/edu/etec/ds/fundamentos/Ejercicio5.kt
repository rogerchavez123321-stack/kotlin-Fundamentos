package edu.etec.ds.fundamentos

fun sumarHasta(n: Int): Int {
    var suma = 0
    for (i in 1..n) {
        suma += i
    }
    return suma
}

fun contarPares(inicio: Int, fin: Int): Int {
    var contador = 0
    for (i in inicio..fin) {
        if (i % 2 == 0) {
            contador++
        }
    }
    return contador
}

fun fibonacci(n: Int): Int {
    if (n == 0) return 0
    if (n == 1) return 1

    var a = 0
    var b = 1
    var resultado = 0

    for (i in 2..n) {
        resultado = a + b
        a = b
        b = resultado
    }
    return resultado
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
    for (n in numeros) {
        if (n > max) {
            max = n
        }
    }
    return max
}

fun encontrarMinimo(numeros: List<Int>): Int {
    var min = numeros[0]
    for (n in numeros) {
        if (n < min) {
            min = n
        }
    }
    return min
}

fun sumarLista(numeros: List<Int>): Int {
    var suma = 0
    for (n in numeros) {
        suma += n
    }
    return suma
}

fun inverter(texto: String): String {
    var resultado = ""
    for (i in texto.length - 1 downTo 0) {
        resultado += texto[i]
    }
    return resultado
}

fun contarVocales(texto: String): Int {
    var contador = 0
    val vocales = "aeiouAEIOU"

    for (c in texto) {
        if (c in vocales) {
            contador++
        }
    }
    return contador
}

fun esPalindromo(texto: String): Boolean {
    var limpio = ""

    // quitar espacios
    for (c in texto) {
        if (c != ' ') {
            limpio += c.lowercaseChar()
        }
    }

    var invertido = ""
    for (i in limpio.length - 1 downTo 0) {
        invertido += limpio[i]
    }

    return limpio == invertido
}

fun tablaMultiplicar(numero: Int): List<Int> {
    val lista = mutableListOf<Int>()
    for (i in 1..10) {
        lista.add(numero * i)
    }
    return lista
}