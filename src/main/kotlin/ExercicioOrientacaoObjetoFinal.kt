enum class Status {
    FUNCIONAMENTO,
    MANUTENCAO,
    QUEBRADO
}

interface Eletrificado {

    abstract fun motorEletrico()
}

abstract class Veiculo(
    val nome: String = "",
    val qtdRodas: Int = 0,
    val status: Status = Status.FUNCIONAMENTO
) {

    abstract fun acelerar()
    abstract fun acelerar(intensidade: Int = 0)
    abstract fun recuperarStatus()
}

class Carro2(
    nome: String = "",
    qtdRodas: Int = 0,
    status: Status = Status.FUNCIONAMENTO
) : Veiculo(nome, qtdRodas, status) {

    companion object {
        fun exibeMensagemVelocidadeMaximaLei() {
            println("Velocidade Maxima permitida: 80KM")
        }
    }

    override fun acelerar() {
        println("Acelerar $nome com $qtdRodas rodas")
    }

    override fun acelerar(intensidade: Int) {
        println("Intensidade da aceleração $intensidade")
        acelerar()
    }

    override fun recuperarStatus() {
        println("O status do veículo é: $status")
    }
}

class Moto(
    nome: String = "",
    qtdRodas: Int = 0,
    status: Status = Status.FUNCIONAMENTO
) : Veiculo(nome, qtdRodas, status), Eletrificado {

    companion object {
        fun exibeVelocidadeMaximaLei() {
            println("Velocidade Maxima permitida: 90KM")
        }
    }

    override fun acelerar() {
        motorEletrico()
        println("Acelerar $nome com $qtdRodas rodas")
    }

    override fun acelerar(intensidade: Int) {
        println("Intensidade da aceleração $intensidade")
        acelerar()
    }

    override fun recuperarStatus() {
        println("O status do veículo é: $status")
    }

    override fun motorEletrico() {
        println("Rodando com motor elétrico")
    }

}


fun main() {

    Carro2.exibeMensagemVelocidadeMaximaLei()
    val car = Carro2("BMW 320i", 4, Status.MANUTENCAO)
    car.acelerar(10)
    car.recuperarStatus()
    println()

    Moto.exibeVelocidadeMaximaLei()
    val moto = Moto("Kawasaki Z1000", 2, Status.QUEBRADO)
    moto.acelerar(6)
    moto.recuperarStatus()
}