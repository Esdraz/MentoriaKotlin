

class Produto {

    // 3 maneiras de iniciar - tipo vazio, tipo null ou lateinit
//    var descricao: String = ""
//    var descricao: String? = null
    lateinit var descricao: String

}


fun main() {

    val produto = Produto()
    produto.descricao = "PS5"
    println(produto.descricao)
}