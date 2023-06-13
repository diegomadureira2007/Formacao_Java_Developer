package _6_lab_java_loja_livros_iniciante;

class CupomDesconto {
    private String codigo;
    private double porcentagemDesconto;

    public CupomDesconto(String codigo, double porcentagemDesconto) {
        this.codigo = codigo;
        this.porcentagemDesconto = porcentagemDesconto;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getPorcentagemDesconto() {
        return porcentagemDesconto;
    }
}