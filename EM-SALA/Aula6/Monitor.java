public class Monitor extends Aluno{
    private double desconto;

    //GETS E SETS
    public double getDesconto() {
        return desconto;
    }
    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }


    //CONSTRUTOR
    public Monitor(String nome, int idade, int quantidade_disciplinas, double valor_disciplinas, double desconto){
        super(nome, idade, quantidade_disciplinas, valor_disciplinas);
        this.desconto = desconto;
    }

    //METODOS
    public double mensalidade(){
        double valorFinal = quantidade_disciplinas * valor_disciplina * (1 - desconto);
        System.out.println("O monitor " + this.getNome() + " ira pagar " + valorFinal + " por " + getQuantidade_disciplinas() + " disciplinas custando " + (getValor_disciplina()*(1-desconto)) + " por disciplina.");
        return valorFinal;
    }

    public double mensalidade(double novoDesconto){
        double valorFinal = quantidade_disciplinas * valor_disciplina * (1 - novoDesconto);
        System.out.println("O monitor " + this.getNome() + " ira pagar " + valorFinal + " por " + getQuantidade_disciplinas() + " disciplinas custando " + (getValor_disciplina()*(1-novoDesconto)) + " por disciplina em um mes com o desconto especial.");
        return valorFinal;
    }

}