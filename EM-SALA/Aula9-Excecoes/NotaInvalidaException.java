// PASSO 1: declarar

// PASSO 2: lançar

// PASSO 3: tratar

public class NotaInvalidaException extends Exception{
    public NotaInvalidaException(){
        super("\nNota inserida invalida, operacao abortada.\n");
    }
    public NotaInvalidaException(double nota1, double nota2){
        String notasinvalidas = "";
        if(nota1 > 10 || nota1 < 0){
            notasinvalidas =+ nota1 + " ";
        }
        if(nota2 > 10 || nota2 < 0){
            notasinvalidas =+ nota2 + " ";
        }
        super("Notas invalidas: " + notasinvalidas);
    }
}
