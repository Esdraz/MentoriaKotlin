
//interface já é abstrata por padrao
interface Presidenciavel {

    abstract fun candidatar()
}

abstract class Pessoa {

    fun comer() = println("comer")
}

class DevAndroid : Pessoa() {
    fun programar() = println("programando...")
}


//implementando a interface
class Jornalista : Pessoa() , Presidenciavel {
    fun escreverNoticia() = println("escrevendo noticia...")

    override fun candidatar() {
        println("Fazer processo para se candidatar")
    }
}


fun main() {
    val devAndroid = DevAndroid()
    devAndroid.programar()
    devAndroid.comer()

    val jornalista = Jornalista()
    jornalista.candidatar()
    jornalista.escreverNoticia()
}
