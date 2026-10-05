public enum Ticket{ //enum é uma classe especial que representa um grupo de constantes (variáveis finais estáticas)
    NORMAL(0.0),
    MEIA_ENTRADA(0.5),
    VIP(0.1);
    double desconto;

    //construtor
    Ticket(double desconto){ 
        this.desconto = desconto;
    }

    //metodo, aqui é um getter, pois retorna o valor do desconto
    public double getDesconto(){
        return desconto;
    }
}