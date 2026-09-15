public class Sala {
    private String nome;
    private boolean ocupada;
    private Aluno[] turma;
    private int diaDeAula;

    //CONSTRUTOR
    public Sala(String nome, boolean ocupada) {
        this.nome = nome;
        this.ocupada = ocupada;
        this.turma = new Aluno[10];
        this.diaDeAula = 0;
    }

    //metodo
    public void Alternar() {
        ocupada = !ocupada;
    }

    //gets e sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isOcupada() {
        return ocupada;
    }
    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }
    public Aluno[] getTurma() {
        return turma;
    }
    public void setTurma(Aluno[] turma) {
        this.turma = turma;
    }
    public int getDiaDeAula() {
        return diaDeAula;
    }
    public void setDiaDeAula(int diaDeAula) {
        this.diaDeAula = diaDeAula;
    }
}