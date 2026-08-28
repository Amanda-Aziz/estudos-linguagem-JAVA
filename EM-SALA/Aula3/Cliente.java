public class Cliente {
    private String nome;
    Ticket entrada;
    private double valor;

    public Cliente(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

    // ========================= gets e sets =========================

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getValor(){
        return this.valor;
    }

    //public void setValor(){
      //this.valor = valor;
    //}

    // ========================= gets e sets =========================

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