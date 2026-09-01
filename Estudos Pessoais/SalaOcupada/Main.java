public class Main {
    public static void main(String[] args) {
        //testando e criando as pessoas

        // Criando os alunos
        Aluno aluno1 = new Aluno("Amanda Aziz", 20, 1);
        Aluno aluno2 = new Aluno("Pedro Kawan", 21, 2);

        // Criando sala
        Sala sala = new Sala();

        // Colocando alunos na sala
        sala.setTurma(new Aluno[]{aluno1, aluno2});

        // Criando professor
        Professor professor = new Professor("Jheymesson", 35, 123 ); //nome, idade, matr
        // Colocando a sala no professor
        professor.setSala(sala);

        // iniciando a aula
        professor.iniciarAula();

        // fazendo a chamada
        professor.chamada();

        // Terminando a aula
        professor.terminarAula();
    }
}
