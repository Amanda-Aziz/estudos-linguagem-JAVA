package Aula3;

public enum Ticket{
    NORMAL(0.0),
    MEIA_ENTRADA(0.5),
    VIP(0.1);

    double desconto;

    Ticket(double d){
        this.desconto = d;
    }

    public double getDesconto(){
        return desconto;
    }
}