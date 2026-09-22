import java.util.Random;

public class Investimento extends Conta {
    private String risco;

    public Investimento(String agencia, String numero, double saldo, String risco) {
        super(agencia, numero, saldo);
        this.risco = risco;
    }

    public void investir(double valor) {
        Random gerador = new Random();
        int sorteio = gerador.nextInt(100);

        if (risco.equals("baixo")) {
            if (sorteio < 85) {
                double rendimento = valor * 0.025;
                setSaldo(getSaldo() + rendimento);
            }
        } else if (risco.equals("medio")) {
            if (sorteio < 45) {
                double rendimento = valor * 0.30;
                setSaldo(getSaldo() + rendimento);
            }
        } else if (risco.equals("alto")) {
            if (sorteio < 2) {
                double rendimento = valor * 1.00;
                setSaldo(getSaldo() + rendimento);
            }
        }
    }

    //get e set
    public String getRisco() {
        return risco;
    }
    public void setRisco(String risco) {
        this.risco = risco;
    }
}