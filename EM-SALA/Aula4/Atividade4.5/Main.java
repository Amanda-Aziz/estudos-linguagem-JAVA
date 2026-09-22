public class Main {
    public static <Aluno, Sala, Professor> void main(String[] args) {

        Aluno aluno1 = new Aluno("Amanda",20,1001);
        Aluno aluno2 = new Aluno("Pedro",21,1002);
        Aluno aluno3 = new Aluno("Kawan",22,1003);
        Sala sala = new Sala("Sala 101",false);

        // COLOCANDO OS ALUNOS EM TURMA
        Aluno[] turma = sala.getTurma();
        turma[0] = aluno1;
        turma[1] = aluno2;
        turma[2] = aluno3;

        Professor professor = new Professor("Jheymesson",40,5001,sala);

        // INICIANDO AULA

        professor.IniciarAula();

        boolean[] chamada = {true,false,true,false,false,false,false,false,false,false};

        professor.Chamada(chamada);
        professor.TerminarAula();

        System.out.println(
            "Próximo dia de aula: "
            + sala.getDiaDeAula()
        );
    }
}