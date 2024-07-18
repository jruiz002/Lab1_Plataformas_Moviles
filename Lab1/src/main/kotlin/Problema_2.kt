// Función para identificar si una palabra es palíndroma
fun palindroma(words: List<String>): Int{
    var counter = 0
    for (word in words){
        var wordReverse = word.reversed()
        // Se compara si la palabra es la misma al reves que la original
        if (wordReverse.equals(word)) counter++
    }
    // Se retorna el número de palabras palíndromas
    return counter
}

// Función para saber si una palabra tiene por lo menos dos vocales y retorna la cantidad de palabras que cumplen que esa condición
fun differentVowels(words: List<String>): Int {
    var counter = 0
    val vowels = setOf('a', 'e', 'i', 'o', 'u')
    // Se recorre toda la lista de palabras
    for (word in words) {
        var wordsVowels = mutableSetOf<Char>()
        for (letter in word) {
            if (letter in vowels) {
                wordsVowels.add(letter)
            }
        }
        // Se verifica el size del set
        if(wordsVowels.size >= 2){
            // Se aumenta el contador
            counter++
        }
    }
    // Se retorna el contador
    return counter
}

// Función para saber si una palabra empieza con una consonante
fun consonantWord(words: List<String>): Int{
    var counter = 0
    val vocales = setOf('a', 'e', 'i', 'o', 'u')
    for (palabra in words) {
        if (palabra.isNotEmpty() && palabra[0] !in vocales) {
            counter++
        }
    }
    // Se retorna la cantidad de palabras que empiozan con una letra consonante
    return counter
}

fun main() {
    // Se crea un arreglo de las palabras que el usuario desea agregar
    val words: MutableList<String> = mutableListOf()
    var continueAsk = true
    // Se agrega la n cantidad de palabras
    while (continueAsk){
        println("Ingrese la palabra: ")
        var word = readln()
        words.add(word.lowercase())
        println("¿Desea agregar otra palabra?")
        println("1. Si")
        println("2. No")
        var option = readln().toInt()
        if (option == 2) continueAsk = false
    }
    // Se llaman a las funciones del proyecto
    println("Número de palabras palíndromas: " + palindroma(words))
    println("Número de palabras con al menos dos vocales distintas: " + differentVowels(words))
    println("Número de palabras que empiezan con consonante: " + consonantWord(words))
}

