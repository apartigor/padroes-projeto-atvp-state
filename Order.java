public class Order {
    private iState state;

    public Order() {
        this.state = new NovoState(this); 
    }

    public void setState(iState state) {
        this.state = state; 
    }

    public void pagar() { 
        state.pagar(); 
    }

    public void enviar() { 
        state.enviar(); 
    }

    public void entregar() {
        state.entregar();
    }

    public void cancelar() { 
        state.cancelar();
    }
}