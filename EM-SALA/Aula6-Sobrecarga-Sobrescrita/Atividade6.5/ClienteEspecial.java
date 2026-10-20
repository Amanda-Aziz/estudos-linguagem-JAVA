public class ClienteEspecial extends Cliente {
    private int pontos;
    private double saldoDeCompras;

    //================= CONSTRUTOR
    public ClienteEspecial(String nome, int idade, String cpf, String endereco, boolean bomCliente,int pontos, double saldoDeCompras){
        super(nome, idade, cpf, endereco, bomCliente);
        this.pontos = pontos;
        this.saldoDeCompras = saldoDeCompras;
    }

    //================= METODOS
    @Override
    public double[] Comprar() {
        double total = 0;
        int quantidadeItens = 0;

        for (int i = 0; i < getCarrinhoDeCompras().length; i++) {

            if (getCarrinhoDeCompras()[i] != null) {

                total += getCarrinhoDeCompras()[i].getValor();
                quantidadeItens++;

                int estoqueAtual =
                        getCarrinhoDeCompras()[i].getQuantidadeEstoque();

                getCarrinhoDeCompras()[i].setQuantidadeEstoque(
                        estoqueAtual - 1
                );
            }
        }

        double desconto = total * 0.05;
        double totalComDesconto = total - desconto;

        saldoDeCompras += totalComDesconto;

        while (saldoDeCompras >= 100) {
            pontos += 5;
            saldoDeCompras -= 100;
        }

        double media = 0;

        if (quantidadeItens > 0) {
            media = totalComDesconto / quantidadeItens;
        }

        System.out.println("Total sem desconto: R$ " + total);
        System.out.println("Desconto: R$ " + desconto);
        System.out.println("Total da compra: R$ " + totalComDesconto);
        System.out.println("Média por item: R$ " + media);
        System.out.println("Pontos: " + pontos);
        System.out.println("Saldo de compras: R$ " + saldoDeCompras);

        return new double[]{totalComDesconto, media};
    }

    public void Comprar(Item item, int pontosNecessarios) {
        if (pontos >= pontosNecessarios) {
            pontos -= pontosNecessarios;
            int estoqueAtual = item.getQuantidadeEstoque();
            item.setQuantidadeEstoque(estoqueAtual - 1);

            System.out.println("Compra realizada utilizando pontos.");
            System.out.println("Item: " + item.getNome());
            System.out.println("Pontos utilizados: " + pontosNecessarios);
            System.out.println("Pontos restantes: " + pontos);

        } else {

            System.out.println("Pontos insuficientes para realizar a compra.");
        }
    }

    //GETS E SETS
    public int getPontos() {
        return pontos;
    }
    public void setPontos(int pontos) {
        this.pontos = pontos;
    }
    public double getSaldoDeCompras() {
        return saldoDeCompras;
    }
    public void setSaldoDeCompras(double saldoDeCompras) {
        this.saldoDeCompras = saldoDeCompras;
    }
}