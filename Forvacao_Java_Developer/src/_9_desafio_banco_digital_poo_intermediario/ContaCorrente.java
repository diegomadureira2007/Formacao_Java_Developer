package _9_desafio_banco_digital_poo_intermediario;

//Classe ContaCorrente representa uma conta corrente no banco
class ContaCorrente extends Conta {
 public ContaCorrente(Cliente titular, int agencia, int numero, double saldo) {
     super(titular, agencia, numero, saldo);
 }
}
