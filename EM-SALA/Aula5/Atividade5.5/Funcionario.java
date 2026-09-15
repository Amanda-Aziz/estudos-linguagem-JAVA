import java.util.Random;

public class Funcionario extends Cliente {

    private String cargo;

    public Funcionario(String nome, int idade, Conta conta, String cargo) {
        super(nome, idade, conta);
        this.cargo = cargo;
    }

    public void InvestimentoEspecial() {

        Random gerador = new Random();

        int sorteio = gerador.nextInt(0, 101);

        if (sorteio < 60) {

            double rendimento = getConta().getSaldo() * 0.50;

            getConta().setSaldo(
                getConta().getSaldo() + rendimento
            );

            System.out.println(
                "Investimento especial teve sucesso!"
            );

        } else {

            System.out.println(
                "Investimento especial não teve sucesso."
            );
        }
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}