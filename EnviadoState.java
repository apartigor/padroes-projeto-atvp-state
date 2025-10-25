public class EnviadoState implements iState {
    private Order order;

    public EnviadoState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Erro: O pedido já foi pago e enviado.");
    }

    @Override
    public void enviar() {
        System.out.println("Erro: O pedido já foi enviado.");
    }

    @Override
    public void entregar() {
        System.out.println("Pedido entregue ao cliente!");
        order.setState(new EntregueState(order));
    }

    @Override
    public void cancelar() {
        System.out.println("Erro: Não é possível cancelar um pedido já enviado.");
    }
}