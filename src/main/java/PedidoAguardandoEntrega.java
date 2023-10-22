public class PedidoAguardandoEntrega extends EstadoPedido {
    public PedidoAguardandoEntrega(Pedido pedido) {
        super(pedido);
    }

    @Override
    public void confirmar() {

    }

    @Override
    public void preparar() {

    }

    @Override
    public void entregar() {

    }

    @Override
    public void concluir() {
        pedido.setEstado(new PedidoEntregue(pedido));
    }

    @Override
    public void cancelar() {
        pedido.setEstado(new PedidoCancelado(pedido));
    }

    @Override
    public String getDescricao() {
        return "Aguardando Entrega";
    }
}
