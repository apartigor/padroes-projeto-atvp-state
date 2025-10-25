public class PagoState implements iState {
    private Order order;

    public PagoState(Order order) {
        this.order = order;
    }

    @Override
    public void pagar() {
        System.out.println("Erro: O pedido já foi pago.");
    }

    @Override
    public void enviar() {
        System.out.println("Pedido enviado!");
        order.setState(new EnviadoState(order));
    }

    @Override
    public void entregar() {
        System.out.println("Erro: O pedido deve ser enviado antes de ser entregue.");
    }

    @Override
    public void cancelar() {
        System.out.println("Pedido cancelado.");
        order.setState(new CanceladoState(order));
    }
}