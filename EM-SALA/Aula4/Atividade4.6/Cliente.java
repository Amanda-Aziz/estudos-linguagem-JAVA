public class Cliente {
    private String nome;
    private boolean vip;
    private Produto[] carrinho;

    //CONSTRUTOR
    public Cliente(String nome, boolean vip) {
        this.nome = nome;
        this.vip = vip;
        this.carrinho = new Produto[10];
    }


    //METODOS
    public void adicionarProduto(Produto produto) {
        for (int i = 0; i < carrinho.length; i++) {

            if (carrinho[i] == null) {

                carrinho[i] = produto;

                System.out.println("Produto adicionado ao carrinho.");
                return;
            }
        }

        System.out.println(
            "Não é possível adicionar mais produtos. "
            + "O carrinho está cheio."
        );
    }

    public void removerProduto(int posicao) {
        if (posicao < 0 || posicao >= carrinho.length) {

            System.out.println("Posição inválida.");
            return;
        }

        if (carrinho[posicao] == null) {

            System.out.println("Não existe produto nessa posição.");
            return;
        }

        for (int i = posicao; i < carrinho.length - 1; i++) {

            carrinho[i] = carrinho[i + 1];
        }

        carrinho[carrinho.length - 1] = null;

        System.out.println("Produto removido do carrinho.");
    }

    public void comprar() {

        double total = 0;

        for (int i = 0; i < carrinho.length; i++) {

            if (carrinho[i] != null) {

                total += carrinho[i].getValor();
            }
        }

        if (vip) {

            total = total * 0.90;
        }

        System.out.println("===== CONTA =====");
        System.out.println("Cliente: " + nome);

        if (vip) {
            System.out.println("Cliente VIP: 10% de desconto.");
        }

        System.out.println("Total da compra: R$ " + total);

        for (int i = 0; i < carrinho.length; i++) {

            carrinho[i] = null;
        }
    }

    //gets e sets
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public boolean isVip() {
        return vip;
    }
    public void setVip(boolean vip) {
        this.vip = vip;
    }
    public Produto[] getCarrinho() {
        return carrinho;
    }
    public void setCarrinho(Produto[] carrinho) {
        this.carrinho = carrinho;
    }
}