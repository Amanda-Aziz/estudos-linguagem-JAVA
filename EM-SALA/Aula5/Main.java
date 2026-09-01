public class Main{

    public static void main(String[] args) {
        Estudante e = new Estudante("Pedro", 6767, 576.78);
        e.entrarEmAula();
        e.sairDeAula();

        EstudanteBolsista eb = new EstudanteBolsista("Amanda", 4242, 576.78, 0.2);

        eb.entrarEmAula();
        eb.sairDeAula();

        System.out.println("===================================");

        System.out.println(e instanceof Estudante);
        System.out.println(eb instanceof EstudanteBolsista);
        System.out.println(e instanceof EstudanteBolsista);
        System.out.println(eb instanceof Estudante);

        System.out.println("===================================");

        System.out.println("mensalidade do aluno " + e.getNome() + " e: " + e.getMensalidade());
        System.out.println("mensalidade original do aluno " + eb.getNome() + " e: " + eb.calcularMensalidade());

        System.out.println("===================================");
    }
}
