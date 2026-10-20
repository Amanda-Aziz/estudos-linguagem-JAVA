public class Carro extends Veiculo {
    private String placa;

    public Carro(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual,double litragemTanque, double velocidadeMaxima,String placa){
        super(marca, estado, tanque, consumo, velocidadeAtual, litragemTanque, velocidadeMaxima);
        this.placa = placa;
    }

    public void Acelerar() {
        double novaVelocidade = getVelocidadeAtual() + 10;
        if (novaVelocidade > getVelocidadeMaxima()) {
            novaVelocidade = getVelocidadeMaxima();
        }
        setVelocidadeAtual(novaVelocidade);
    }
    
    // ============================================================
    
    public void Frear() {
        double novaVelocidade = getVelocidadeAtual() - 5;
        if (novaVelocidade < 0) {
            novaVelocidade = 0;
        }
        setVelocidadeAtual(novaVelocidade);
    }
    
    // ============================================================
    
    public void Chavear() {
        if (isEstado() && getVelocidadeAtual() > 0) {
            while (getVelocidadeAtual() > 0) {
                Frear();
            }
        }
        super.Chavear();
    }
    
    // ============================================================
    
    public void corrida(double distancia, double gasolinaEspecial) {
        if (getTanque() + gasolinaEspecial > getLitragemTanque()) {
            System.out.println("Erro: a quantidade de gasolina ultrapassa a capacidade do tanque.");
            return;
        }

        double consumoOriginal = getConsumo();

        // Gasolina especial > reduz o consumo em 50%
        double consumoEspecial = consumoOriginal * 0.5;
        double distanciaComEspecial = gasolinaEspecial * consumoEspecial;

        if (distancia <= distanciaComEspecial) {
            double gasolinaUsada = distancia / consumoEspecial;
            setTanque(getTanque() - gasolinaUsada);
        } else {
            double distanciaRestante = distancia - distanciaComEspecial;
            double gasolinaNormal = distanciaRestante / consumoOriginal;
            double gasolinaTotal = gasolinaEspecial + gasolinaNormal;

            if (gasolinaTotal > getTanque() + gasolinaEspecial) {
                System.out.println("Gasolina insuficiente.");
            } else {
                setTanque(getTanque() - gasolinaNormal);
            }
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}