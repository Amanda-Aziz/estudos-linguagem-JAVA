public class Main {

    public static void main(String[] args) {

        // =========================
        // CLIENTES
        // =========================

        Cliente cliente1 = new Cliente(
                "João",
                20,
                new Conta("001", "1001", 1000)
        );

        Cliente cliente2 = new Cliente(
                "Maria",
                25,
                new Conta("001", "1002", 2000)
        );

        Cliente cliente3 = new Cliente(
                "Pedro",
                30,
                new Conta("001", "1003", 3000)
        );


        // =========================
        // FUNCIONÁRIOS
        // =========================

        Funcionario funcionario1 = new Funcionario(
                "Carlos",
                35,
                new Conta("001", "2001", 1000),
                "Gerente"
        );

        Funcionario funcionario2 = new Funcionario(
                "Ana",
                28,
                new Conta("001", "2002", 2000),
                "Atendente"
        );

        Funcionario funcionario3 = new Funcionario(
                "Lucas",
                40,
                new Conta("001", "2003", 3000),
                "Diretor"
        );


        // =========================
        // INVESTIMENTOS
        // =========================

        Investimento investimento1 =
                new Investimento("001", "3001", 1000, "baixo");

        Investimento investimento2 =
                new Investimento("001", "3002", 2000, "medio");

        Investimento investimento3 =
                new Investimento("001", "3003", 3000, "alto");


        // =========================
        // 10 INVESTIMENTOS
        // =========================

        System.out.println("===== INVESTIMENTOS =====");

        investimento1.investir();
        investimento1.investir();
        investimento1.investir();

        investimento2.investir();
        investimento2.investir();
        investimento2.investir();

        investimento3.investir();

        funcionario1.InvestimentoEspecial();


        // =========================
        // SALDOS FINAIS
        // =========================

        System.out.println();
        System.out.println("===== SALDOS FINAIS =====");

        System.out.println(
                "Investimento 1: R$ "
                + investimento1.getSaldo()
        );

        System.out.println(
                "Investimento 2: R$ "
                + investimento2.getSaldo()
        );

        System.out.println(
                "Investimento 3: R$ "
                + investimento3.getSaldo()
        );

        System.out.println(
                "Funcionário 1: R$ "
                + funcionario1.getConta().getSaldo()
        );

        System.out.println(
                "Funcionário 2: R$ "
                + funcionario2.getConta().getSaldo()
        );

        System.out.println(
                "Funcionário 3: R$ "
                + funcionario3.getConta().getSaldo()
        );
    }
}