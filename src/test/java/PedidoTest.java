import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void testPedidoFluxoNormal() {
        Pedido pedido = new Pedido();

        assertEquals("Novo", pedido.getDescricaoEstado());

        pedido.confirmar();
        assertEquals("Novo", pedido.getDescricaoEstado());

        pedido.preparar();
        assertEquals("Preparando", pedido.getDescricaoEstado());

        pedido.entregar();
        assertEquals("Aguardando Entrega", pedido.getDescricaoEstado());

        pedido.concluir();
        assertEquals("Entregue", pedido.getDescricaoEstado());
    }

    @Test
    void testPedidoCancelado() {
        Pedido pedido = new Pedido();

        assertEquals("Novo", pedido.getDescricaoEstado());

        pedido.cancelar();
        assertEquals("Cancelado", pedido.getDescricaoEstado());

        pedido.confirmar();
        assertEquals("Cancelado", pedido.getDescricaoEstado());

        pedido.preparar();
        assertEquals("Cancelado", pedido.getDescricaoEstado());

        pedido.entregar();
        assertEquals("Cancelado", pedido.getDescricaoEstado());

        pedido.concluir();
        assertEquals("Cancelado", pedido.getDescricaoEstado());
    }

    @Test
    void testPedidoReproducaoRepetida() {
        Pedido pedido = new Pedido();

        assertEquals("Novo", pedido.getDescricaoEstado());

        pedido.preparar();
        assertEquals("Preparando", pedido.getDescricaoEstado());

        pedido.preparar();
        assertEquals("Preparando", pedido.getDescricaoEstado());

        pedido.entregar();
        assertEquals("Aguardando Entrega", pedido.getDescricaoEstado());

        pedido.preparar();
        assertEquals("Aguardando Entrega", pedido.getDescricaoEstado());
    }
}
