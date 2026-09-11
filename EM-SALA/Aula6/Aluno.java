public class Aluno {
    private String nome;
    private int idade;
    public int quantidade_disciplinas;
    public double valor_disciplina;

    //CONSTRUTOR
    public Aluno(String nome, int idade, int quantidade_disciplinas, double valor_disciplinas){
        this.nome = nome;
        this.idade = idade;
        this.quantidade_disciplinas = quantidade_disciplinas;
        this.valor_disciplina = valor_disciplinas;
    }

    // GETS E SETS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public int getQuantidade_disciplinas() {
        return quantidade_disciplinas;
    }
    public void setQuantidade_disciplinas(int quantidade_disciplinas) {
        this.quantidade_disciplinas = quantidade_disciplinas;
    }
    public double getValor_disciplina() {
        return valor_disciplina;
    }
    public void setValor_disciplina(double valor_disciplina) {
        this.valor_disciplina = valor_disciplina;
    }

    //METODOS
    public double mensalidade(){
        double valorFinal = quantidade_disciplinas * valor_disciplina;
        System.out.println("O aluno " + this.nome + " ira pagar " + valorFinal + " por " + quantidade_disciplinas + " disciplinas");
        return valorFinal;
    }



}