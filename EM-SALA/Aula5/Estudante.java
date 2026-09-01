public class Estudante {
    private String nome;
    private int matricula;
    private double mensalidade;

    //construtor
    public Estudante(String nome, int matricula, double mensalidade){
        this.nome = nome;
        this.matricula = matricula;
        this.mensalidade = mensalidade;
    }

    // gets e sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public double getMensalidade() {
        return mensalidade;
    }
    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }


    public void entrarEmAula(){
        System.out.println("\nO aluno acabou de entrar na aula.");
    }

    public void sairDeAula(){
        System.out.println("O aluno acabou de sair da aula FAAAAAAAAAAAAAAAAH\n");
    }
}
