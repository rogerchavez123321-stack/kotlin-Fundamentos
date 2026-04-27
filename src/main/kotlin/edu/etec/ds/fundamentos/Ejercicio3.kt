package edu.etec.ds.fundamentos
fun saludar(): String {
    return "Hola, bienvenido!"
}

fun saludarConNombre(nombre: String): String {
    return "Hola, Ana!"
}

fun saludarPersona(nombre: String, apellido: String): String {
    return "Hola, $nombre$apellido!"
}

fun saludarConDefault(nombre: String = "Usuario"): String {
    return "Hola, $nombre!"
}

fun crearSaludo(titulo: String, nombre: String): String {
    return "Hola, $titulo $nombre"
}

fun funcionSinRetorno(): Unit {
    return Unit
}

fun cuadrado(numero: Int): Int {
    return numero * numero
}

fun contarCaracteres(texto: String): Int {
    return contarCaracteres(texto)

}

fun String.cuentaCaracteres(): Int {
    return this.length

    return TODO("Provide the return value")
}

infix fun Int.esMayorQue(otro: Int): Boolean {
    return this > otro
    TODO("Funcion infix para comparar numeros")
}

fun sumarTodos(vararg numeros: Int): Int {
    return numeros.sum()
    TODO("Sumar todos los numeros pasados como varargs")
}

fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    return operacion(a, b)
    TODO("Aplicar una operacion lambda a dos numeros")
}
