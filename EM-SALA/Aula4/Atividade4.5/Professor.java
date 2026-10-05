public class Professor {
    private String nome;
    private int idade;
    private int matricula;
    private Sala sala;

    //gets e sets
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
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public Sala getSala() {
        return sala;
    }
    public void setSala(Sala sala) {
        this.sala = sala;
    }

    //CONSTRUTOR
    public Professor(String nome, int idade, int matricula, Sala sala) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.sala = sala;
    }

    //--------------------------------------------------------- METODOS

    public void IniciarAula() {
        if (!sala.isOcupada()) { // a sala NÃO esta ocupada?
            System.out.println("A aula está acontecendo com o professor "+ nome +", matrícula " + matricula); 
            sala.Alternar(); // muda a sala para ocupada
        } else { // se a sala já estiver ocupada
            System.out.println("A sala está ocupada.");
        }
    }

    public void Chamada(boolean[] chamada) {
        
        if (!sala.isOcupada()) {// a sala NAO esta ocupada?
            System.out.println("Não existe aula acontecendo.");
            return;
        }
        int dia = sala.getDiaDeAula(); //Pega o dia que está guardado na Sala.
        if (dia >= 10) {
            System.out.println("Não há mais dias de aula disponíveis.");
            return;
        }
        //vvvvvvvvvvv Sala.java -> Aluno[] turma 
        Aluno[] turma = sala.getTurma(); //Aqui você pega o vetor de alunos que está dentro da sala

        for (int i = 0; i < 10; i++) {  //Passa pelos 10 lugares da turma
            if (turma[i] != null) { //Existe um aluno nessa posição?
                if (turma[i].getPresenca() == null) { //Esse alunoja tem um vetor para guardar as presenças?
                    turma[i].setPresenca(new Boolean[10]); //Se ainda não possui...Cria um vetor com 10 posi
                }
                turma[i].getPresenca()[dia] = chamada[i]; //registra a presença
            }
        }
        System.out.println("Chamada realizada no dia " + dia + ".");
    }

    public void TerminarAula() {
        if (!sala.isOcupada()) {//A sala NÃO está ocupada?
            System.out.println("Não existe aula nela.");
        } else {
            System.out.println("Aula finalizada pelo professor "+ nome + ", matrícula "+ matricula);
            sala.Alternar(); //Então ele inverte o estado da sala, A aula terminou → a sala fica livre.
            sala.setDiaDeAula(sala.getDiaDeAula() + 1); //"Pegue o dia atual da aula, aumente 1 e salve esse novo valor"
        }
    }

}