public class Ventilador implements Tomada{
    public String marca;
    public String modelo;
    public int tensao;
    public boolean fusivel;
    public boolean ligado = false; //começa desligado

    //construtor
    public Ventilador(String marca, String modelo, int tensao, boolean fusivel) {
        this.marca = marca;
        this.modelo = modelo;
        this.tensao = tensao;
        this.fusivel = true;
    }
    
    //metodos
    public void ligar(){
        if(ligado == false){
            ligado = true;
            System.out.println("O ventilador esta ligado e funcionando.");
        }else{
            System.out.println("O ventilador ja esta ligado!");
        }
    }

    public void desligar(){
        if(ligado == true){
            ligado = false;
            System.out.println("O ventilador esta desligado e parado.");
        }else{
            System.out.println("O ventilador ja estava parado!");
        }
    }
}
