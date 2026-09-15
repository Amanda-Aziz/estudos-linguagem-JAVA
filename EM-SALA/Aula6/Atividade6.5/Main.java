public class Main {

    public static void main(String[] args) {

        //ITNS
        Item item1 = new Item("Notebook",1,3000.00,10,true);
        Item item2 = new Item("Mouse",2,100.00,20,true);
        Item item3 = new Item("Teclado",3,200.00,15,true);

        //CLIENTE
        Cliente cliente = new Cliente("João",20,"12345678900","Rua A",true);

        cliente.Adicionar(item1);
        cliente.Adicionar(item2);
        cliente.Adicionar(item3);
        cliente.Comprar();

        // CLIENTE ESPECIAL
        ClienteEspecial clienteEspecial = new ClienteEspecial( "Maria", 25, "98765432100", "Rua B", true,10,0);
        clienteEspecial.Adicionar(item1);
        clienteEspecial.Adicionar(item2);
        clienteEspecial.Comprar();

        System.out.println();

        // Compra usando pontos
        clienteEspecial.Comprar(item3, 5);


        //FUNCIONÁRIO
        Funcionario funcionario = new Funcionario("Carlos",30,"11122233344","Rua C",true,20,0,"Estoque", 1, 3000.00);

        funcionario.RenovarEstoque(item1, 5);
        funcionario.BloquearItem(item1);
    }
}