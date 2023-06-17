package _9_desafio_banco_digital_poo_intermediario;
import java.util.ArrayList;
import java.util.List;

//Classe Banco representa o banco digital
class Banco {
 private List<ContaCorrente> contasCorrente;
 private List<ContaPoupanca> contasPoupanca;

 public Banco() {
     this.contasCorrente = new ArrayList<>();
     this.contasPoupanca = new ArrayList<>();
 }

 public void criarConta(Cliente titular, int agencia, int numeroContaCorrente, int numeroContaPoupanca, double saldoCorrente, double saldoPoupanca) {
     ContaCorrente contaCorrente = new ContaCorrente(titular, agencia, numeroContaCorrente, saldoCorrente);
     contasCorrente.add(contaCorrente);

     ContaPoupanca contaPoupanca = new ContaPoupanca(titular, agencia, numeroContaPoupanca, saldoPoupanca);
     contasPoupanca.add(contaPoupanca);
 }

 public ContaCorrente buscarContaCorrente(int numeroConta) {
     for (ContaCorrente conta : contasCorrente) {
         if (conta.getNumero() == numeroConta) {
             return conta;
         }
     }
     return null;
 }

 public ContaPoupanca buscarContaPoupanca(int numeroConta) {
     for (ContaPoupanca conta : contasPoupanca) {
         if (conta.getNumero() == numeroConta) {
             return conta;
         }
     }
     return null;
 }

 public void exibirInformacoesConta(ContaCorrente contaCorrente, ContaPoupanca contaPoupanca) {
     System.out.println("Titular: " + contaCorrente.getTitular().getNome());
     System.out.println("Agência: " + contaCorrente.getAgencia());
     
     System.out.println("=== Conta Corrente ===");
     System.out.println("Conta Corrente: " + contaCorrente.getNumero());
     System.out.println("Saldo Corrente: " + contaCorrente.getSaldo());
     
     System.out.println("=== Conta Poupança ===");
     System.out.println("Conta Poupança: " + contaPoupanca.getNumero());
     System.out.println("Saldo Poupança: " + contaPoupanca.getSaldo());
 }
}
