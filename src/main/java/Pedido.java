public class Pedido {
    private EstadoPedido estado;

    public Pedido() {
        this.estado = new PedidoNovo(this);
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public void confirmar() {
        estado.confirmar();
    }

    public void preparar() {
        estado.preparar();
    }

    public void entregar() {
        estado.entregar();
    }

    public void concluir() {
        estado.concluir();
    }

    public void cancelar() {
        estado.cancelar();
    }

    public String getDescricaoEstado() {
        return estado.getDescricao();
    }
}
