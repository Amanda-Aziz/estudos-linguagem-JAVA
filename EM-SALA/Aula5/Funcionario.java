import java.util.Random;

public class Funcionario extends Cliente {
    private String cargo;

    public Funcionario(String nome, int idade, Conta conta, String cargo) {
        super(nome, idade, conta);
        this.cargo = cargo;
    }

    public void investimentoEspecial(double valor) {

        Random gerador = new Random();

        int sorteio = gerador.nextInt(100);

        if (sorteio < 60) {

            double rendimento = valor * 0.50;

            getConta().setSaldo(
                getConta().getSaldo() + rendimento
            );
        }
    }

    //get e set
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}