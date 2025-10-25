public class NovoState implements iState {
    private Order order;  

    public NovoState(Order order) { 
        this.order = order; 
    }

    @Override
    public void pagar() { 
        System.out.println("Pedido pago com sucesso!");  
        order.setState(new PagoState(order));  
    }

    @Override
    public void enviar() {  
        System.out.println("Erro: O pedido deve ser pago antes de ser enviado."); 
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