public class Aviao extends Veiculo {
    private boolean voando;

    public Aviao(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual,double litragemTanque, double velocidadeMaxima,boolean voando) {
        super(marca, estado, tanque, consumo, velocidadeAtual,litragemTanque, velocidadeMaxima);
        this.voando = voando;
    }

    public void Voar() {
        if (getVelocidadeAtual() >= 200) {
            voando = true;
            System.out.println("O avião está voando!");
        }
    }
    
    // ============================================================

    public void Acelerar() {
        if (voando) {
            setVelocidadeAtual(getVelocidadeAtual() + 20);
        } else {
            double novaVelocidade = getVelocidadeAtual() + 10;
            if (novaVelocidade > getVelocidadeMaxima()) {
                novaVelocidade = getVelocidadeMaxima();
            }
            setVelocidadeAtual(novaVelocidade);
        }
    }

    // ============================================================
    
    public void Frear() {
        if (voando) {
            setVelocidadeAtual(getVelocidadeAtual() - 10);
            if (getVelocidadeAtual() < 200) {
                setVelocidadeAtual(200);
                voando = false;
                System.out.println("O avião pousou!");
            }
        } else {
            double novaVelocidade = getVelocidadeAtual() - 5;
            if (novaVelocidade < 0) {
                novaVelocidade = 0;
            }
            setVelocidadeAtual(novaVelocidade);
        }
    }

    // ============================================================

    public void Chavear() {
        if (getVelocidadeAtual() > 0) {
            System.out.println("O avião não pode ser desligado em movimento.");
        } else {
            super.Chavear();
        }
    }
    
    // ============================================================
    
    public void Corrida(double distancia) {
        double gasolinaNecessaria = distancia / getConsumo();

        if (gasolinaNecessaria > getTanque()) {
            if (voando) {
                voando = false;
                System.out.println("Pouso emergencial!");
            }
            setVelocidadeAtual(0);
            setTanque(0);
        } else {
            setTanque(getTanque() - gasolinaNecessaria);
        }
    }

    public boolean isVoando() {
        return voando;
    }

    public void setVoando(boolean voando) {
        this.voando = voando;
    }
}