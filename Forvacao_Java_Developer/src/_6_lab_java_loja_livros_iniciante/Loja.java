package _6_lab_java_loja_livros_iniciante;
import java.util.ArrayList;
import java.util.List;

public class Loja {
    private List<Item> itens;
    private CupomDesconto cupomDesconto;
    private Cliente cliente;

    public Loja(Cliente cliente) {
        this.itens = new ArrayList<>();
        this.cupomDesconto = null;
        this.cliente = cliente;
    }

    public void adicionarItem(Item item) {
        itens.add(item);
    }

    public void adicionarCupomDesconto(CupomDesconto cupom) {
        this.cupomDesconto = cupom;
    }

    public double calcularValorTotal() {
        double valorTotal = 0;

        for (Item item : itens) {
            valorTotal += item.preco * item.quantidade;
        }

        if (cupomDesconto != null) {
            double desconto = valorTotal * cupomDesconto.getPorcentagemDesconto();
            valorTotal -= desconto;
        }

        return valorTotal;
    }

    public double calcularFrete() {
        double frete = 0;

        for (Item item : itens) {
            if (item instanceof Livro) {
                Livro livro = (Livro) item;
                if (livro.getGenero().equals("DRAMA")) {
                    frete += livro.preco * livro.quantidade * 0.15;
                } else if (livro.getGenero().equals("SUSPENSE")) {
                    frete += livro.preco * livro.quantidade * 0.10;
                } else if (livro.getGenero().equals("ROMANCE")) {
                    frete += livro.preco * livro.quantidade * 0.05;
                }
            } else if (item instanceof Caderno) {
                Caderno caderno = (Caderno) item;
                if (caderno.getQuantidadeMaterias() == 2) {
                    frete += caderno.preco * caderno.quantidade * 2;
                } else if (caderno.getQuantidadeMaterias() == 5) {
                    frete += caderno.preco * caderno.quantidade * 5;
                } else if (caderno.getQuantidadeMaterias() == 10) {
                    frete += caderno.preco * caderno.quantidade * 10;
                }
            }
        }

        return frete;
    }

    public void exibirPedido() {
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("CPF: " + cliente.getCpf());

        System.out.println("Pedido:");

        for (Item item : itens) {
            if (item instanceof Livro) {
                Livro livro = (Livro) item;
                System.out.println("Livro: " + livro.nome);
                System.out.println("Gênero: " + livro.getGenero());
                System.out.println("Quantidade: " + livro.quantidade);
                System.out.println("Preço unitário: R$" + livro.preco);
            } else if (item instanceof Caderno) {
                Caderno caderno = (Caderno) item;
                System.out.println("Caderno: " + caderno.nome);
                System.out.println("Quantidade de matérias: " + caderno.getQuantidadeMaterias());
                System.out.println("Quantidade: " + caderno.quantidade);
                System.out.println("Preço unitário: R$" + caderno.preco);
            }
        }

        System.out.println("Valor total do pedido: R$" + calcularValorTotal());
        System.out.println("Valor do frete: R$" + calcularFrete());
    }

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Diêgo", "123456789");
        Loja loja = new Loja(cliente);

        Livro livro1 = new Livro("Livro 1", "DRAMA", 19.99, 2);
        Livro livro2 = new Livro("Livro 2", "ROMANCE", 14.99, 1);
        Caderno caderno1 = new Caderno("Caderno 1", 5, 9.99, 3);

        loja.adicionarItem(livro1);
        loja.adicionarItem(livro2);
        loja.adicionarItem(caderno1);

        CupomDesconto cupom = new CupomDesconto("DESCONTO10", 0.1);
        loja.adicionarCupomDesconto(cupom);

        loja.exibirPedido();
    }
}
