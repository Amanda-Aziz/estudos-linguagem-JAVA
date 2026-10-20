public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Pedro", 30.0);

        c1.calculo(); //vazio
        c1.entrada = Ticket.NORMAL;
        c1.calculo(); //calculo normal

        System.out.println("TESTE: " + (30 * Ticket.NORMAL.desconto));
        
        System.out.println(c1.getNome());
        System.out.println(c1);
        System.out.println("\n");
    }
}