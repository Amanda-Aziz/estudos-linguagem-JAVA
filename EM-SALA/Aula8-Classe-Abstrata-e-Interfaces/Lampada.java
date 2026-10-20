public class Lampada implements Tomada{
    public String marca;
    public int tensao;
    public boolean funcionando = false;

    //construtor
    public Lampada(String marca, int tensao) {
        this.marca = marca;
        this.tensao = tensao;
        // this.funcionando = funcionando;
    }

    //metodos
    public void ligar(){
        if(funcionando){
            System.out.println("A lampada ja esta ligada");
        }else{
            funcionando = true;
            System.out.println("A lampada agora esta ligada e iluminando");
        }
    }

    public void desligar(){
        if(!funcionando){
            System.out.println("A lampada ja esta desligada");
        }else{
            funcionando = false;
            System.out.println("A lampada agora esta desligada e esta escuro");
        }
    }
}
