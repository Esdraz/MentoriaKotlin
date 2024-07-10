enum class StatusPedido {
    AGUARDANDO_PAGAMENTO,
    PEDIDO_REALIZADO,
    PAGAMENTO_APROVADO,
    PEDIDO_ENVIADO,
    PEDIDO_ENTREGUE
}


class Pedido(
    var total: Double = 0.0,
    var itens: String = "",
) {

    var statusPedido: StatusPedido = StatusPedido.AGUARDANDO_PAGAMENTO
}


fun main() {

    //tela compras
    val pedido = Pedido(150.0, "PS5, TV")
    pedido.statusPedido = StatusPedido.PEDIDO_REALIZADO
    println("Status do Pedido: ${StatusPedido.PEDIDO_REALIZADO}")
    //ordinal exibe o numero do enum
    println("Status do Pedido: ${StatusPedido.PEDIDO_REALIZADO.ordinal}")


    //tela pagamento
    pedido.statusPedido = StatusPedido.AGUARDANDO_PAGAMENTO
    println("Status do Pedido: ${StatusPedido.AGUARDANDO_PAGAMENTO}")

    //historico compra
    pedido.statusPedido = StatusPedido.PAGAMENTO_APROVADO
    println("Status do Pedido: ${StatusPedido.PAGAMENTO_APROVADO}")

    //transportadora
    pedido.statusPedido = StatusPedido.PEDIDO_ENVIADO
    println("Status do Pedido: ${StatusPedido.PEDIDO_ENVIADO}")

    //entrega transportadora
    pedido.statusPedido = StatusPedido.PEDIDO_ENTREGUE
    println("Status do Pedido: ${StatusPedido.PEDIDO_ENTREGUE}")

}