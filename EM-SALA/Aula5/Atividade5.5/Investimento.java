import java.util.Random;

public class Investimento extends Conta {

    private String risco;

    public Investimento(String agencia, String numero, double saldo, String risco) {
        super(agencia, numero, saldo);
        this.risco = risco;
    }

    public void investir() {

        Random gerador = new Random();

        int sorteio = gerador.nextInt(0, 101);

        if (risco.equalsIgnoreCase("baixo")) {

            if (sorteio < 85) {
                double rendimento = getSaldo() * 0.025;
                setSaldo(getSaldo() + rendimento);

                System.out.println("Investimento de baixo risco teve sucesso.");
            } else {
                System.out.println("Investimento de baixo risco não teve sucesso.");
            }

        } else if (risco.equalsIgnoreCase("medio") ||
                   risco.equalsIgnoreCase("médio")) {

            if (sorteio < 45) {
                double rendimento = getSaldo() * 0.30;
                setSaldo(getSaldo() + rendimento);

                System.out.println("Investimento de médio risco teve sucesso.");
            } else {
                System.out.println("Investimento de médio risco não teve sucesso.");
            }

        } else if (risco.equalsIgnoreCase("alto")) {

            if (sorteio < 2) {
                double rendimento = getSaldo();
                setSaldo(getSaldo() + rendimento);

                System.out.println("Investimento de alto risco teve sucesso.");
            } else {
                System.out.println("Investimento de alto risco não teve sucesso.");
            }

        } else {
            System.out.println("Risco inválido.");
        }
    }

    public String getRisco() {
        return risco;
    }

    public void setRisco(String risco) {
        this.risco = risco;
    }
}