public class Main {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Amanda",20,new Investimento("001", "1001", 1000.00, "baixo"));

        Cliente cliente2 = new Cliente("Pedro",21,new Investimento("001", "1002", 1500.00, "medio"));

        Cliente cliente3 = new Cliente("Thais",34,new Investimento("001", "1003", 2000.00, "alto"));

        Funcionario funcionario1 = new Funcionario("Romy",49,new Conta("002", "2001", 1000.00),"Gerente");

        Funcionario funcionario2 = new Funcionario("Gabriel",16,new Conta("002", "2002", 1500.00),"Analista");

        Funcionario funcionario3 = new Funcionario("Alexandre",67,new Conta("002", "2003", 2000.00),"Diretor");


        // 10 investimentos

        for (int i = 0; i < 10; i++) {

            ((Investimento) cliente1.getConta()).investir(100);
            ((Investimento) cliente2.getConta()).investir(100);
            ((Investimento) cliente3.getConta()).investir(100);

            funcionario1.investimentoEspecial(100);
            funcionario2.investimentoEspecial(100);
            funcionario3.investimentoEspecial(100);
        }


        // Exibindo os saldos

        System.out.println("===== SALDOS FINAIS =====");

        System.out.println(cliente1.getNome() +": R$ "+cliente1.getConta().getSaldo());
        System.out.println(cliente2.getNome() +": R$ "+cliente2.getConta().getSaldo());
        System.out.println(cliente3.getNome() + ": R$ " + cliente3.getConta().getSaldo());

        System.out.println(funcionario1.getNome() + ": R$ " + funcionario1.getConta().getSaldo());
        System.out.println(funcionario2.getNome() + ": R$ " + funcionario2.getConta().getSaldo());
        System.out.println(funcionario3.getNome() + ": R$ " +funcionario3.getConta().getSaldo());
    }
}