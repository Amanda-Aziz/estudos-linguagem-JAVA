public class Professor {
    private String nome;
    private int idade;
    private int matricula;
    private Sala sala;

    //CONSTRUTOR
    public Professor(String nome, int idade, int matricula, Sala sala) {
        this.nome = nome;
        this.idade = idade;
        this.matricula = matricula;
        this.sala = sala;
    }

    //METODOS
    public void IniciarAula() {
        if (!sala.isOcupada()) {
            System.out.println(
                "A aula está acontecendo com o professor "
                + nome
                + ", matrícula "
                + matricula
            );
            sala.Alternar();
        } else {
            System.out.println("A sala está ocupada.");
        }
    }

    public void Chamada(boolean[] chamada) {
        if (!sala.isOcupada()) {
            System.out.println("Não existe aula acontecendo.");
            return;
        }
        int dia = sala.getDiaDeAula();
        if (dia >= 10) {
            System.out.println("Não há mais dias de aula disponíveis.");
            return;
        }

        Aluno[] turma = sala.getTurma();

        for (int i = 0; i < 10; i++) {
            if (turma[i] != null) {
                if (turma[i].getPresenca() == null) {
                    turma[i].setPresenca(new Boolean[10]);
                }
                turma[i].getPresenca()[dia] = chamada[i];
            }
        }
        System.out.println("Chamada realizada no dia " + dia + ".");
    }

    public void TerminarAula() {
        if (!sala.isOcupada()) {
            System.out.println("Não existe aula nela.");
        } else {
            System.out.println(
                "Aula finalizada pelo professor "
                + nome
                + ", matrícula "
                + matricula
            );
            sala.Alternar();
            sala.setDiaDeAula(
                sala.getDiaDeAula() + 1
            );
        }
    }

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
}