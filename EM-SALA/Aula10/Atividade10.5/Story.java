public class Story extends Publicacao{
    private int visualizacoes;

    //get e set
    public int getVisualizacoes() {
        return visualizacoes;
    }
    public void setVisualizacoes(int visualizacoes) {
        this.visualizacoes = visualizacoes;
    }

    //construtor
    public Story(String autor, String conteudo, int curtidas, int visualizacoes) {
        super(autor, conteudo, curtidas);
        this.visualizacoes = visualizacoes;
    }

    //------------------------- metodos

    public void visualizar(){
        setVisualizacoes(getVisualizacoes()+1);
    }

    public void exibir(String autor, String conteudo, int curtidas, int visualizacoes){
        System.out.println("Autor(a): " + autor);
        System.out.println("Conteudo: " + conteudo);
        System.out.println("Quantidade de curtidas: " + curtidas);
        System.out.println("Quantidade de visualizacoes: " + visualizacoes);
    }
}