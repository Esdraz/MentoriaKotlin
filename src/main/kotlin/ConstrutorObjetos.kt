class Usuario1 (
    //construtor primario
    var nome: String = "",
    var sobrenome: String = ""
){
    init {
        println("Objeto inicializado")
        println("nome: $nome, sobrenome: $sobrenome")
    }

    //construtor secundario
    //const secundario sempre tem que chamar o primario :this(parametros)
    constructor(nome: String): this(nome, ""){
        println("Construtor secundario")
    }

}

fun main() {
    val usuario1 = Usuario1("Francisco")


}