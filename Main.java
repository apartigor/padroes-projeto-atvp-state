public class Main {
    public static void main(String[] args) {
        System.out.println("--- Teste 1: Fluxo Principal (Caminho feliz) ---");
        Order order1 = new Order();

        order1.pagar();
        order1.enviar();
        order1.entregar();

        System.out.println("\n--- Teste 2: Cancelamento ---");
        Order order2 = new Order();
        order2.pagar();
        order2.cancelar();
        order2.enviar();

    }
}