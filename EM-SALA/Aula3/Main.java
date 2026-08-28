public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Carlos", 30.0);

        c1.calculo();
        c1.entrada = Ticket.NORMAL;

        c1.calculo();
        System.out.println(30 * Ticket.NORMAL.desconto);
        System.out.println(c1.getNome());
        System.out.println(c1);
    }
}
