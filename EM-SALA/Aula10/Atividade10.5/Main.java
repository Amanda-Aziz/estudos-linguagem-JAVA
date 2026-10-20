public class Main {
    public static void main(String[] args) {
        Publicacao p1 = new Publicacao("Amanda", "cozinha", 7);
        Story s1 = new Story("Amanda", "cozinha", 10, 28);
        
        Compartilhavel c;

        System.out.println("\n================================================");
        
        c = (Compartilhavel)p1;
        c.compartilhar();

        c = (Compartilhavel)s1;
        c.compartilhar();
        
        System.out.println(p1);
        System.out.println(s1);
        
        System.out.println("================================================");
    }
}