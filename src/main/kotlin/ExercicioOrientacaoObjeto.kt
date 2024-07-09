class ContaBancaria(
    var agencia: String = "",
    var conta: String = "",
    var senha: String = ""
) {

    var usuarioAutenticado: Boolean = false
    var saldo: Double = 0.0

    init {
        this.usuarioAutenticado = true
        println(
            """
                Efetuando login...
                Agencia: $agencia
                Conta: $conta
                Senha: $senha
                Login efetuado com sucesso!!!
            """.trimIndent()
        )
        println()
    }

    fun recuperarSaldo(): Double {
        if (usuarioAutenticado == true) {
            return this.saldo
        } else {
            return 0.0
        }
    }

    fun depositar(valor: Double) {
        this.saldo = this.saldo + valor;
    }

    fun sacar(valor: Double) {
        if (saldo >= valor) {
            this.saldo = saldo - valor;
        } else {
            println("Saldo insuficiente para essa ação!")
        }
    }

    fun extrado(dias: Int) {
        println("Extrado dos últimos $dias dias.")
    }

    fun extrato(dataInicial: String, dataFinal: String) {
        println("Extrato intervalo $dataInicial e $dataFinal")
    }

}

fun main() {
    val user = ContaBancaria("0032", "12345-4", "pwd123$#")

    println("Saldo da Conta: ${user.recuperarSaldo()}")
    user.depositar(200.0)
    println("Saldo da Conta: ${user.recuperarSaldo()}")
    user.sacar(140.0)
    println("Saldo da Conta: ${user.recuperarSaldo()}")
    user.recuperarSaldo()
    user.extrado(5)
    user.extrato("10/05/2022", "10/06/2022")
}