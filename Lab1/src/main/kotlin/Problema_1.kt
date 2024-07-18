// Función que convierte un número decimal a su representación binaria.
fun decimalABinary(decimal: Int): String {
    // Si el número decimal es 0, retorna "0" directamente.
    if (decimal == 0) return "0"
    var number = decimal
    // StringBuilder para construir la representación binaria.
    var binary = StringBuilder()
    // Bucle que realiza la conversión de decimal a binario.
    while (number > 0) {
        // Calcula el resto de la división del número por 2 (0 o 1).
        var remainder = number % 2
        // Añade el resto al final del StringBuilder.
        binary.append(remainder)
        // Actualiza el número dividiéndolo entre 2.
        number /= 2
    }
    // Invierte el contenido del StringBuilder y lo convierte en cadena para obtener la representación binaria correcta.
    return binary.reverse().toString()
}

fun main() {
    // Solicita al usuario que ingrese un número en sistema decimal.
    println("Ingrese un número en sistema decimal.")
    // Lee la entrada del usuario y la convierte a entero.
    val decimalNumber = readln().toInt()
    // Llama a la función decimalABinario para convertir el número decimal a binario.
    val binaryNumber = decimalABinary(decimalNumber)
    // Imprime el resultado de la conversión.
    println("El número decimal $decimalNumber en binario es: $binaryNumber")
}

