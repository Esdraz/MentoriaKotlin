
//Abstração
class Jogador {
    var kart = ""
    var pneu = ""
    var planador = ""

    fun acelerar(aceleracao: Int) {
        println("Acelerando na velocidade $aceleracao KM")
    }

//    fun retornarPoder(): String {
//        return "Jogando Casco Vermelho."
//    }
    fun retornarPoder(): String = "Jogando Casco Vermelho."

}

fun main() {
    //instanciar jogador
    val jogador = Jogador()
    jogador.kart = "Kart do Mario"
    jogador.pneu = "Pneus Off-road"
    jogador.planador = "Planador a jato"

    jogador.acelerar(80)
    println(jogador.retornarPoder())
}