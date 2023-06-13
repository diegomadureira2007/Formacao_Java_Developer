package _6_lab_java_loja_livros_iniciante;

class Livro extends Item {
    private String genero;

    public Livro(String nome, String genero, double preco, int quantidade) {
        super(nome, preco, quantidade);
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }
}