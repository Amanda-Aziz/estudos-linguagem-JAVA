public class Veiculo {

    private String marca;
    private boolean estado;
    private double tanque;
    private double consumo;
    private double velocidadeAtual;
    private double litragemTanque;
    private double velocidadeMaxima;

    // ============================================================ CONSTRUTOR
    public Veiculo(String marca, boolean estado, double tanque, double consumo, double velocidadeAtual, double litragemTanque, double velocidadeMaxima) {
        this.marca = marca;
        this.estado = estado;
        this.tanque = tanque;
        this.consumo = consumo;
        this.velocidadeAtual = velocidadeAtual;
        this.litragemTanque = litragemTanque;
        this.velocidadeMaxima = velocidadeMaxima;
    }

    // ============================================================ METODOS
    public void Chavear() {
        estado = !estado;
    }

    public void Acelerar() {
        if (velocidadeAtual < velocidadeMaxima) {
            velocidadeAtual++;

            if (velocidadeAtual > velocidadeMaxima) {
                velocidadeAtual = velocidadeMaxima;
            }
        }
    }
    
    // ===============================================
    
    public void Frear() {
        if (velocidadeAtual > 0) {
            velocidadeAtual--;

            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }
    }
    
    // ===============================================
    
    public void Corrida(double distancia) {
        double litrosGastos = distancia * consumo;

        if (litrosGastos > litragemTanque) {
            double distanciaPercorrida = litragemTanque / consumo;
            double distanciaFaltante = distancia - distanciaPercorrida;

            velocidadeAtual = 0;
            litragemTanque = 0;

            System.out.println("Combustível insuficiente!");
            System.out.println("Faltam " + distanciaFaltante + " km para completar a corrida.");
        } else {
            litragemTanque -= litrosGastos;

            System.out.println("Corrida realizada com sucesso!");
            System.out.println("Combustível restante: " + litragemTanque);
        }
    }


    // ============================================================ GETS E SETS
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public double getTanque() {
        return tanque;
    }

    public void setTanque(double tanque) {
        this.tanque = tanque;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public double getLitragemTanque() {
        return litragemTanque;
    }

    public void setLitragemTanque(double litragemTanque) {
        this.litragemTanque = litragemTanque;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}