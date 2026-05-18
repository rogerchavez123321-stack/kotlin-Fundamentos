package edu.etec.ds.fundamentos

fun evaluarPositivo(numero: Int): String {
    return when {
        numero > 0 -> "Positivo"
        else -> "No positivo"
    }
}

fun clasificarNumero(numero: Int): String {
    return when {
        numero > 10 -> "Mayor a 10"
        numero < 10 -> "Menor a 10"
        else -> "Igual a 10"
    }
}

fun evaluarEdad(edad: Int): String {
    return when {
        edad < 18 -> "Menor de edad"
        edad in 18 .. 65 -> "Adulto"
        else -> "Adulto mayor"
    }
}

fun obtenerDescuento(monto: Double): Double {
        return when {
            monto >= 200 -> 30.0
            monto >= 150 -> 20.0
            monto > 100 -> 10.0
            else -> 0.0
        }
    }
fun calcular(operador: Char, a: Int, b: Int): Double {
    return when (operador) {
        '+' -> (a + b).toDouble()
        '-' -> (a - b).toDouble()
        '*' -> (a * b).toDouble()
        '/' -> if (b != 0) a.toDouble() / b else 0.0
        else -> 0.0
    }
}
