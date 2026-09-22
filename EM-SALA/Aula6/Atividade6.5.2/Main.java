public class Main {
    public static void main(String[] args) {

        // ============================ CARRO

        Carro carro = new Carro("Toyota",false,50.0,10.0,0.0,50.0,180.0,"ABC-1234");

        System.out.println("===== CARRO =====");

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Placa: " + carro.getPlaca());
        System.out.println("Velocidade: " + carro.getVelocidadeAtual());
        System.out.println("Tanque: " + carro.getTanque());

        // Liga
        carro.Chavear();

        System.out.println("Carro ligado: " + carro.isEstado());

        // Acelera
        carro.Acelerar();
        System.out.println("Velocidade após acelerar: " + carro.getVelocidadeAtual());

        carro.Acelerar();
        System.out.println("Velocidade após acelerar: " + carro.getVelocidadeAtual());

        // Freia
        carro.Frear();
        System.out.println("Velocidade após frear: " + carro.getVelocidadeAtual());

        // Corrida
        carro.Corrida(100);

        System.out.println("Tanque após corrida: "+ carro.getTanque());

        // Desliga o carro
        carro.Chavear();

        System.out.println("Carro ligado: " + carro.isEstado());


        // ============================ AVIÃO

        Aviao aviao = new Aviao("Boing",false,1000.0,5.0,0.0,1000.0,900.0,false);

        System.out.println("\n===== AVIÃO =====");

        System.out.println("Marca: " + aviao.getMarca());
        System.out.println("Velocidade: " + aviao.getVelocidadeAtual());
        System.out.println("Tanque: " + aviao.getTanque());

        // Liga
        aviao.Chavear();

        System.out.println("Avião ligado: " + aviao.isEstado());

        // Acelera ate 200
        for (int i = 0; i < 20; i++) {
            aviao.Acelerar();
        }

        System.out.println("Velocidade: " + aviao.getVelocidadeAtual());

        // voar
        aviao.Voar();

        System.out.println("Está voando: " + aviao.isVoando());

        // Acelera 
        aviao.Acelerar();

        System.out.println("Velocidade voando: "+ aviao.getVelocidadeAtual());

        // Freia
        aviao.Frear();

        System.out.println("Velocidade após frear: " + aviao.getVelocidadeAtual());

        // Corrida
        aviao.Corrida(100);

        System.out.println("Tanque após corrida: " + aviao.getTanque());
    }
}