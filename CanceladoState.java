public class CanceladoState implements iState {

    public CanceladoState(Order order) {
    }

    @Override
    public void pagar() {
        System.out.println("Erro: O pedido está cancelado.");
    }

    @Override
    public void enviar() {
        System.out.println("Erro: O pedido está cancelado.");
    }

    @Override
    public void entregar() {
        System.out.println("Erro: O pedido está cancelado.");
    }

    @Override
    public void cancelar() {
        System.out.println("Erro: O pedido já está cancelado.");
    }
}