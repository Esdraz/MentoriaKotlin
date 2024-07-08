
// constante global
const val nomeUsuario = "Pedro"
fun main() {

    // var -> valor mutável
    var nome = "Pedro"
    nome = "Francisco"

    // val -> valor imutável (constante)
    val sobrenome = "Sousa"

    println("olá, tudo bem $nome $sobrenome?")

    val num1 = 10

    // tipagem explicita
    val num2: Int = 40
    val resultado = num1 + num2

    println(resultado)
    println(nomeUsuario)

}