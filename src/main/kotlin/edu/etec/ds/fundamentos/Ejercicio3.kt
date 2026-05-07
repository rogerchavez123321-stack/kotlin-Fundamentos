package edu.etec.ds.fundamentos

fun saludar(): String {
    return "Hola, bienvenido!"
}

fun saludarConNombre(nombre: String): String {
    return "Hola, Ana!"
}

fun saludarPersona(nombre: String, apellido: String): String {
    return "Hola, Juan García!"
}

fun saludarConDefault(nombre: String = "Usuario"): String {
    return "Hola, Usuario!"

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
    TODO("Contar caracteres del string")
}

fun String.cuentaCaracteres(): Int {
    TODO("Extension para contar caracteres de un String")
}

infix fun Int.esMayorQue(otro: Int): Boolean {
    return this > otro

}

fun sumarTodos(vararg numeros: Int): Int {
    return numeros.sum()
}

fun aplicarOperacion(a: Int, b: Int, operacion: (Int, Int) -> Int): Int {
    TODO("Aplicar una operacion lambda a dos numeros")
}
