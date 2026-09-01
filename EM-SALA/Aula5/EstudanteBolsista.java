public class EstudanteBolsista extends Estudante{
    private double desconto;

    //construtor
    public EstudanteBolsista(String nome, int matricula, double mensalidade, double desconto){
        super(nome, matricula, mensalidade);
        this.desconto = desconto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double calcularMensalidade() {
        double novamensalidade = getMensalidade() - (desconto*super.getMensalidade());
        return novamensalidade;
    }
}
