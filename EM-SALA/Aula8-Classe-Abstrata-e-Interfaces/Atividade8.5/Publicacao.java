public class Publicacao implements Compartilhavel{
    private String autor;
    private String conteudo;
    private int curtidas;

    //gets e sets
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getConteudo() {
        return conteudo;
    }
    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
    public int getCurtidas() {
        return curtidas;
    }
    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    //construtor
    public Publicacao(String autor, String conteudo, int curtidas) {
        this.autor = autor;
        this.conteudo = conteudo;
        this.curtidas = curtidas;
    }

    //------------------------- metodos

    public void curtir(){
        this.curtidas = getCurtidas()+1;
    }

    public void exibir(){
        System.out.println("Autor(a): " + autor);
        System.out.println("Conteudo: " + conteudo);
        System.out.println("Quantidade de curtidas: " + curtidas);
    }

    public void compartilhar() {
        System.out.println("A publicação de " + autor + " foi compartilhada!");
    }
}