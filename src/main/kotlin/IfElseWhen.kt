fun main() {
    val notaAluno = 1
    val condicao = notaAluno >= 2
    if (condicao) {
        println("Aluno Aprovado!")
    } else {
        println("Aluno Reprovado!")
    }

    val opcao = 6
    if (opcao in 1..3) {
        println("Opções selecionadas: 1, 2, 3")
    } else if (opcao in 4..8) {
        println("Opções selecionadas: 4, 5, 6, 7, 8")
    }

    val selecao = 5
    when(selecao) {
        1 -> println("Sacar")
        2 -> println("Depositar")
        3 -> println("Saldo")
        in 4..6 -> println("Sair")
        else -> println("Opcão invalida!")
    }
}