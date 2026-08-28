package SalaOcupada;

public class Aluno {
    private String nome;
    private int idade;
    private int matricula;
    private boolean[] presenca = new boolean[4]; //tipo de dado usado quando só pd ser true ou false

    //CONSTRUTOR: metodo usado para criar um objeto. Criar o objeto ja com determinados valores.
    public Aluno(String nome, int idade, int matricula){ //parâmetros. P criar um Aluno, vou receber nome, idade e matr.
        this.nome = nome; //this é AUTOREFERENCIA
        this.idade = idade;
        this.matricula = matricula;
    } 

    // GETS E SETS

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }
    public int getMatricula(){
        return matricula;
    }
    public boolean[] getPresenca(){
        return presenca;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setPresenca(boolean[] presenca){
        this.presenca = presenca;
    }
}
