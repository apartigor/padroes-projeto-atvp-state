public class EntregueState implements iState {

    public EntregueState(Order order) {
    }

    @Override
    public void pagar() {
        System.out.println("Erro: O pedido já foi entregue.");
    }

    @Override
    public void enviar() {
        System.out.println("Erro: O pedido já foi entregue.");
    }

    @Override
    public void entregar() {
        System.out.println("Erro: O pedido já foi entregue.");
    }

    @Override
    public void cancelar() {
        System.out.println("Erro: Não é possível cancelar um pedido já entregue.");
    }
}