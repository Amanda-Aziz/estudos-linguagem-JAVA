public class Cliente {
    Ticket entrada;
    private String nome;
    private double valor;

    //GETS E SETS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }


    public Cliente(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }    

    public void calculo(){
        if(entrada != null){
            System.out.println("Desconto anunciado: " + entrada.desconto);
            double novovalor = entrada.desconto * valor;
            System.out.println("Novo valor: " + novovalor);
            System.out.println("O valor do Ticket é: " + valor + "; E o tipo do Ticket é: " + entrada);
        }
        else
            System.out.println("\nTicket não inserido.");

    }
}