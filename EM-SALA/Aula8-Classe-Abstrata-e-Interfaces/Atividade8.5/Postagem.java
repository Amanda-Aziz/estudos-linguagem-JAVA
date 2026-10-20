public class Postagem extends Publicacao{
    private int quantidadedecompartilhamentos;

    //get e set
    public int getQuantidadedecompartilhamentos() {
        return quantidadedecompartilhamentos;
    }
    public void setQuantidadedecompartilhamentos(int quantidadedecompartilhamentos) {
        this.quantidadedecompartilhamentos = quantidadedecompartilhamentos;
    }
    
    //construtor
    public Postagem(String autor, String conteudo, int curtidas, int quantidadedecompartilhamentos) {
        super(autor, conteudo, curtidas);
        this.quantidadedecompartilhamentos = quantidadedecompartilhamentos;
    }

    //------------------------- metodos

    public void exibir(String autor, String conteudo, int curtidas, int quantidadedecompartilhamentos){
        System.out.println(autor);
        System.out.println(conteudo);
        System.out.println(curtidas);
        System.out.println(quantidadedecompartilhamentos);
    }

    public void compartilhar(){
        setQuantidadedecompartilhamentos(getQuantidadedecompartilhamentos()+1);
    }


}