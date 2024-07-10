class Usuario2 {

    //termite acessar metodo sem instanciar classe
    //tambem pode nomear ex. companion objeto regras {}
    companion object {
        fun verificarUsuarioLogado(): Boolean {
            //codigo verificacao
            return true
        }
    }
}

fun main() {

    // acessando metodo de classe sem instanciar
    val retorno = Usuario2.verificarUsuarioLogado()
    println("Usuário logado: $retorno")
}