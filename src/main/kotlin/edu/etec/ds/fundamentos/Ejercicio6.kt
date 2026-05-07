package edu.etec.ds.fundamentos

fun obtenerDiaSemana(dia: Int): String {
    return  when (dia) {
        1 -> "Lunes"
        2 -> "Martes"
        3 -> "Miercoles"
        4 -> "Jueves"
        5 -> "Viernes"
        6 -> "Sabado"
        7 -> "Domingo"
        else -> "Dia invalido"
    }

}

fun obtenerNombreMes(mes: Int): String {
    return when (mes){
        1 ->"Enero"
        2 ->"Febrero"
        3 ->"Marzo"
        4 ->"Abril"
        5 ->"Mayo"
        6 ->"Junio"
        7 ->"Julio"
        8 ->"Agosto"
        9 ->"Septiembre"
        10 ->"Octubre"
        11 ->"Noviembre"
        12 ->"Diciembre"
        else -> "Mes invalido"
    }

}

fun clasificarNumeroWhen(numero: Int): String {
    return when {
        numero > 0 -> "Positivo"

        numero < 0 -> "Negativo"
        else -> "Cero"
    }
}

fun clasificarEdad(edad: Int): String {
    return when {
        edad < 3 -> "Bebe"
        edad in 1..12 -> "Nino"
        edad in 13..17 -> "Adolescente"
        edad in 18..65 -> "Adulto"
        else -> "Anciano"


    }
}

fun convertirMoneda(moneda: String, monto: Double): Double {
    return when (moneda) {
        "USD" -> monto * 1.85
        "EUR" -> monto * 18
        "JPY" -> monto * 0.10
        else -> 0.0
    }

}

fun realizarOperacion(operador: Char, a: Int, b: Int): Double {
    return when (operador) {
        '+' -> (a + b).toDouble()
        '-' -> (a - b).toDouble()
        '*' -> (a * b).toDouble()
        '/' -> (a / b).toDouble()
        '%'-> (a % b).toDouble()
        else -> 0.0
    }
}

fun obtenerDescuentoWhen(monto: Double): Double {
    return when {
        monto > 200 -> monto * 0.25
        monto > 150 -> monto * 0.15
        monto > 100 -> monto * 0.10
        else -> 0.0
    }
}

fun obtenerCalificacion(nota: Int): String {
    return when {
        nota >=90 -> "Promocionado"
        nota >=60 -> "Aprobado"

        else -> "Desaprobado"
    }

}

fun esVocal(caracter: Char): Boolean {
    return when (caracter.lowercaseChar()) {
        'a', 'e', 'i', 'o', 'u' -> true
        else -> false
    }
}



fun esPrimo(numero: Int): Boolean {
    return when {
        numero <= 1 -> false
        else -> {
            for (i in 2 until numero){
                if (numero % i == 0) {
                    return false
                }
        }

        true
    }

}
}