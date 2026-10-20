public class Aluno{
    public String nome;
    public String RA;
    private double nota;
    
    //get e set de nota
    public double getNota() {
        return nota;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }

    //construtor
    public Aluno(String nome, String rA) {
        this.nome = nome;
        RA = rA;
    }

    //metodo
    public void media(double nota1, double nota2) throws NotaInvalidaException{
        if((nota1 > 10.0 || nota1< 0.0) || (nota2 > 10.0 || nota2< 0.0)){
            NotaInvalidaException nie = new NotaInvalidaException(); //nie: primeiras letras de NotaInvalidaException
            throw nie;
        }else{
            nota = (nota1 + nota2)/2; 
        }
    }
}