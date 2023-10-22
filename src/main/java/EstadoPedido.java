public abstract class EstadoPedido {
    protected Pedido pedido;

    public EstadoPedido(Pedido pedido) {
        this.pedido = pedido;
    }

    public abstract void confirmar();
    public abstract void preparar();
    public abstract void entregar();
    public abstract void concluir();
    public abstract void cancelar();
    public abstract String getDescricao();
}