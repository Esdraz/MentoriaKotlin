fun main() {
    val nomes = arrayOf(
        "Jose", "Pedro", "Maria"
    )

    nomes[0] = "mudou"
    println(nomes[0])

    //Loops
    println("WHILE ====>")
    var num = 1
    while (num <= 5) {
        println("Executou $num")
        num++
    }
    println("FOR ====>")
    for (numero in 1..5) {
        println("Executou $numero")
    }

    println("FOR Array")
    val postagens = arrayOf(
        "Viage praia",
        "Trilha FDS",
        "Corrida 10Km"
    )

    for ((indice, postagem) in postagens.withIndex()) {
        println("$indice: $postagem")
    }
}