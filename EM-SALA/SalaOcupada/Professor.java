public class Professor {
    private String nome;
    private int idade;
    private  int matricula;
    // {Dentro da classe 'Professor' existe uma variável chamada sala que pode guardar uma Sala}
    private Sala sala; //mesma ideia do: Aluno[] turma. Mas aqui estamos numa unica Sala só.

    // CONSTRUTOR
    public Professor(String nome, int idade, int matricula){
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
    }

    // MÉTODOS

    // iniciarAula() -> alterar -> estado da sala     |     A classe SALA já tem o metodo de ALTERAR()
    public void iniciarAula(){  // Professor altera o estado da sala
        sala.alterar();
    }

    public void chamada(){ //Fazer a chamada e marcar como presente (true) cada aluno da turma no dia de aula atual
        Aluno[] turma = sala.getTurma(); // turma será um vetor de Alunos[] | Pegando o vet de alunos q está dentro da sala
        for(int i=0; i<turma.length; i++){
        // pegando o aluno atual e a presença dele ???????????????? FZR 
        }
    }

    public void terminarAula(){
        sala.alterar(); //chamando o metodo de alternar da sala
        sala.setDiaDeAula(sala.getDiaDeAula());
        // pegando o dia de aula e dps tornando um novo dia
    }

    // GETS E SETS

    public String getNome(){
        return nome;
    }
    public int geIdade(){
        return idade;
    }
    public int getMatricula(){
        return matricula;
    }
    public Sala getSala(){
        return sala;
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
    public void setSala(Sala sala){
        this.sala = sala;
    }
}
