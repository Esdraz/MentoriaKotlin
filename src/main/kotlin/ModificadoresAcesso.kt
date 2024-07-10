
//open -> define que a classe pode receber herança
//open por padrao é pública
open class Carro1 {
    private var modelo = ""

    private fun injetarCombustivel() {
        println("Injeção de combustível")
    }

    protected open fun freioDeMao() {
        println("Freando o carro!")
    }

    fun acelerar() {
        freioDeMao()
        injetarCombustivel()
        println("Acelerando o carro...")
    }
}

//subclasse - herda de Carro1
class Gol : Carro1() {
    override fun freioDeMao() {
        println("Acelerando o Gol")
    }
}
