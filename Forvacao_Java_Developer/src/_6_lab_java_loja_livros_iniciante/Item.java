package _6_lab_java_loja_livros_iniciante;

class Item {
    protected String nome;
    protected double preco;
    protected int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}