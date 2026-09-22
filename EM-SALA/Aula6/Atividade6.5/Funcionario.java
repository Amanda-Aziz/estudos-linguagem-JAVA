public class Funcionario extends ClienteEspecial{
    private String setor;
    private int id;
    private double salario;

    //================= CONSTRUTOR

    public Funcionario(String nome, int idade, String cpf,String endereco, boolean bomCliente,int pontos, double saldoDeCompras,String setor, int id, double salario){
        super(nome, idade, cpf, endereco, bomCliente,pontos, saldoDeCompras);
        this.setor = setor;
        this.id = id;
        this.salario = salario;
    }

    //================= METODOS

    public void RenovarEstoque(Item item, int quantidade) {
        int estoqueAtual = item.getQuantidadeEstoque();
        item.setQuantidadeEstoque(estoqueAtual + quantidade);
        System.out.println("Estoque renovado.");
        System.out.println("Novo estoque: " + item.getQuantidadeEstoque());
    }

    public void BloquearItem(Item item) {
        item.setDisponibilidade(!item.isDisponibilidade());
        System.out.println("Disponibilidade do item alterada.");
        System.out.println("Disponível: " + item.isDisponibilidade());
    }

    //GETS E SETS
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
}