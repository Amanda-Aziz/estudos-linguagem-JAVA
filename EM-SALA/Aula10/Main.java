public class Main {
    public static void main(String[] args) {
        Ventilador v1 = new Ventilador("Philco", "brisa", 220, false);
        Lampada l1 = new Lampada("Elgin", 220);

        Tomada t;

        t = v1; //conectando na tomada
        t.ligar();
        t.desligar();
        t.ligar();

        t = l1;
        t.ligar();
        t.desligar();

        t = v1;
        t.ligar(); //o terminal vai avisar que o ventilador ja estava ligado
    }
}
