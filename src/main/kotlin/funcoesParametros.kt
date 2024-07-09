

//parametro num2: Int = 0 (nao obrigatório)
fun somar2(num1: Int, num2: Int = 0) {
    println(num1 + num2)
}

fun main() {
    somar2(10, 30)

    //parametros nomeados
    somar2(num2 = 100, num1 = 50)
    somar2(25)
}