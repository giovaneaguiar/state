public class PedidoCancelado extends EstadoPedido {
    public PedidoCancelado(Pedido pedido) {
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

    }

    @Override
    public String getDescricao() {
        return "Cancelado";
    }
}