public class PedidoPreparando extends EstadoPedido {
    public PedidoPreparando(Pedido pedido) {
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
        pedido.setEstado(new PedidoAguardandoEntrega(pedido));
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
        return "Preparando";
    }
}
