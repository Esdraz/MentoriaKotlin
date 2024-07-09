class Usuario {

    //propriedades do usuario

    //assinatura nome + parametros e seus tipos
    fun logar(email: String, senha: String) {
        println("Usuario logando com email: $email e senha: $senha")
    }

    fun logar(token: String) {
        println("Usuario logando com token: $token")
    }
}

fun main() {

    val usuario = Usuario()
    usuario.logar("teste@gmail.com", "123@acesso")
    usuario.logar("token@123")
}