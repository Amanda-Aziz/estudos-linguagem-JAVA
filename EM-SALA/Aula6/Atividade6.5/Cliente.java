public class Cliente {
    private String nome;
    private int idade;
    private String cpf;
    private String endereco;
    private boolean bomCliente;
    private Item[] carrinhoDeCompras;

    //================= CONSTRUTOR
    public Cliente(String nome, int idade, String cpf, String endereco, boolean bomCliente) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.endereco = endereco;
        this.bomCliente = bomCliente;
        this.carrinhoDeCompras = new Item[100];
    }

    //================= MÉTODOS

    public Cliente(String nome2, int idade2, Conta conta) {
        //TODO Auto-generated constructor stub
    }

    public void Adicionar(Item item) {
        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            if (carrinhoDeCompras[i] == null) {
                carrinhoDeCompras[i] = item;

                System.out.println("Item adicionado ao carrinho.");
                return;
            }
        }
        System.out.println("Carrinho cheio.");
    }

    public void Cancelar(int codigo) {
        for (int i = 0; i < carrinhoDeCompras.length; i++) {
            if (carrinhoDeCompras[i] != null &&
                carrinhoDeCompras[i].getCodigo() == codigo) {

                carrinhoDeCompras[i] = null;

                System.out.println("Item removido do carrinho.");
                return;
            }
        }

        System.out.println("Item não encontrado.");
    }

    public double[] Comprar() {

        double total = 0;
        int quantidadeItens = 0;

        for (int i = 0; i < carrinhoDeCompras.length; i++) {

            if (carrinhoDeCompras[i] != null) {

                total += carrinhoDeCompras[i].getValor();
                quantidadeItens++;

                int estoqueAtual =
                        carrinhoDeCompras[i].getQuantidadeEstoque();

                carrinhoDeCompras[i].setQuantidadeEstoque(
                        estoqueAtual - 1
                );
            }
        }

        double media = 0;

        if (quantidadeItens > 0) {
            media = total / quantidadeItens;
        }

        System.out.println("Total da compra: R$ " + total);
        System.out.println("Média por item: R$ " + media);

        return new double[]{total, media};
    }


    //GETS E SETS
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public boolean isBomCliente() {
        return bomCliente;
    }
    public void setBomCliente(boolean bomCliente) {
        this.bomCliente = bomCliente;
    }
    public Item[] getCarrinhoDeCompras() {
        return carrinhoDeCompras;
    }
    public void setCarrinhoDeCompras(Item[] carrinhoDeCompras) {
        this.carrinhoDeCompras = carrinhoDeCompras;
    }
}