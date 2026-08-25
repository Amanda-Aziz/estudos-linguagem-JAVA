package SalaOcupada;

public class Sala {
    private String nome;
    private  boolean ocupada;
    private Aluno[] turma; //aqui crio um atributo chamado turma, vai ser um vetor de objetos do tipo Aluno.
    private int diaDeAula;

    // METODOS
    public void alterar(){
        if (ocupada == false){
            ocupada = true;
        } else {
            ocupada = false;
        }
    }

    // GETS E SETS

    public String nome(){
        return nome;
    }
    public boolean isOcupad(){
        return ocupada;
    }
    public Aluno[] getTurma(){
        return turma;
    }
    public int getDiaDeAula(){
        return diaDeAula;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setOcupada(boolean ocupada){
        this.ocupada = ocupada;
    }
    public void setTurma(Aluno[] turma){
        this.turma = turma;
    }
    public void setDiaDeAula(int diaDeAula){
        this.diaDeAula = diaDeAula;
    }
}