package _6_lab_java_loja_livros_iniciante;

class Caderno extends Item {
    private int quantidadeMaterias;

    public Caderno(String nome, int quantidadeMaterias, double preco, int quantidade) {
        super(nome, preco, quantidade);
        this.quantidadeMaterias = quantidadeMaterias;
    }

    public int getQuantidadeMaterias() {
        return quantidadeMaterias;
    }
}