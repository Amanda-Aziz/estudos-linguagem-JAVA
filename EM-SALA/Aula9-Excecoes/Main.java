public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Pedro", "007");

        try{
            a1.media(11.0, 7.0);
        }catch(NotaInvalidaException nie){
            System.out.println(nie.getMessage());
        }finally{
            System.out.println("\nOperacao finalizada!\n");
        }

        
        try{
            a1.media(7.0, 9.0);
        }catch(NotaInvalidaException nie){
            System.out.println(nie.getMessage());
        }

    }
}