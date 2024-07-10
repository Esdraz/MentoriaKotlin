
//por padrao as classes e metodos são FINAL
//pode ser usado open para informar que a classe está aberta para extensão (herança)
// ex: open class Animal {}

//classe pai, super classe, abstrata
abstract class Animal {
    var cor = ""
    var tamanho = ""
    var peso = 0.0


    open fun correr() {
        println("Correr como um...")
    }

    //metodo abstrato
    abstract fun dormir()
}

//herança - Cao herda de Animal
class Cao : Animal() {
    fun latir() = println("Latir...")

    //sobreposição polimorfismo
    override fun correr() {
        //chama a fun da classe pai (superclasse)
        super.correr()
        println("cachorro")
    }

    override fun dormir() {
        println("Cachorro Dormindo...")
    }
}

class Passaro : Animal() {
    fun voar() = println("Voar...")
    override fun correr() {
        super.correr()
        println("passaro")
    }

    override fun dormir() {
        println("Passaro Dormindo...")
    }
}


fun main() {

    val cao = Cao()
    cao.correr()
    cao.latir()
    cao.dormir()

//    val passaro = Passaro()
//    passaro.voar()
//    passaro.correr()

}