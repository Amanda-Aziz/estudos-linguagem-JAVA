// PARA COMPILAR E RODAR A MAIN ESCREVA:
// javac nomeDOarquivo.java
// java nomeDOarquivo

public class Main{
    public static void main(String[] args){
        Aluno a1 = new Aluno("Pedro", 21, 6, 160.35);
        a1.mensalidade();
        Monitor m1 = new Monitor("Amanda", 20, 7, 160.35, 0.1);
        m1.mensalidade();
        m1.mensalidade(0.3);
    }
}