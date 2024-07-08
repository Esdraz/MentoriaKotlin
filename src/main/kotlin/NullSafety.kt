class Carro {
    val cor = "vermelho"

    fun Acelerar() {
        // codigo aqui...
    }
}


fun main() {
    var carro: Carro? = null
//    carro = Carro()

    //elvis operator
    val cor = carro?.cor ?: "cor padrão"

    // ? -> chamada segura (testa se carro não está nulo, caso esteja retorna null.)
//    println(carro?.cor)
    println(cor)
}