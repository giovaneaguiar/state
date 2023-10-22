public class PedidoEntregue extends EstadoPedido {
    public PedidoEntregue(Pedido pedido) {
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

    }

    @Override
    public void cancelar() {
        pedido.setEstado(new PedidoCancelado(pedido));
    }

    @Override
    public String getDescricao() {
        return "Entregue";
    }
}