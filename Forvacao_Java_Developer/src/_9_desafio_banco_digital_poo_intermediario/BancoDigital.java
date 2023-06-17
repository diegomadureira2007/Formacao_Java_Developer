package _9_desafio_banco_digital_poo_intermediario;
import java.util.Scanner;

//Classe principal que controla a interação com o usuário
public class BancoDigital {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Banco banco = new Banco();

     System.out.println("Bem-vindo ao Banco Digital!");

     System.out.print("Para inciar sua conta no Banco digite o CPF ou CNPJ: ");
     String cpfCnpj = scanner.nextLine();

     System.out.print("Nome do Titular: ");
     String nomeTitular = scanner.nextLine();

     System.out.print("Número da Agência: ");
     int agencia = scanner.nextInt();

     System.out.print("Número da Conta Corrente: ");
     int numeroContaCorrente = scanner.nextInt();

     System.out.print("Número da Conta Poupança: ");
     int numeroContaPoupanca = scanner.nextInt();

     System.out.print("Saldo Inicial da Conta Corrente: ");
     double saldoCorrente = scanner.nextDouble();

     System.out.print("Saldo Inicial da Conta Poupança: ");
     double saldoPoupanca = scanner.nextDouble();

     Cliente titular = new Cliente(cpfCnpj, nomeTitular);
     banco.criarConta(titular, agencia, numeroContaCorrente, numeroContaPoupanca, saldoCorrente, saldoPoupanca);

     boolean sair = false;

     while (!sair) {
         System.out.println("\nOpções:");
         System.out.println("1. Depositar");
         System.out.println("2. Visualizar Extrato");
         System.out.println("3. Sacar");
         System.out.println("4. Informações da Conta");
         System.out.println("5. Sair");

         System.out.print("Escolha uma opção: ");
         int opcao = scanner.nextInt();

         switch (opcao) {
             case 1:
                 System.out.print("Digite o valor a ser depositado: ");
                 double valorDeposito = scanner.nextDouble();
                 System.out.print("Digite 1 para conta corrente ou 2 para conta poupança: ");
                 int tipoContaDeposito = scanner.nextInt();

                 if (tipoContaDeposito == 1) {
                     ContaCorrente contaCorrente = banco.buscarContaCorrente(numeroContaCorrente);
                     if (contaCorrente != null) {
                         contaCorrente.depositar(valorDeposito);
                         System.out.println("Depósito realizado na conta corrente.");
                     } else {
                         System.out.println("Conta corrente não encontrada.");
                     }
                 } else if (tipoContaDeposito == 2) {
                     ContaPoupanca contaPoupanca = banco.buscarContaPoupanca(numeroContaPoupanca);
                     if (contaPoupanca != null) {
                         contaPoupanca.depositar(valorDeposito);
                         System.out.println("Depósito realizado na conta poupança.");
                     } else {
                         System.out.println("Conta poupança não encontrada.");
                     }
                 } else {
                     System.out.println("Opção inválida.");
                 }
                 break;

             case 2:
                 System.out.print("Digite 1 para extrato da conta corrente ou 2 para extrato da conta poupança: ");
                 int tipoContaExtrato = scanner.nextInt();

                 if (tipoContaExtrato == 1) {
                     ContaCorrente contaCorrente = banco.buscarContaCorrente(numeroContaCorrente);
                     if (contaCorrente != null) {
                         contaCorrente.exibirExtrato();
                     } else {
                         System.out.println("Conta corrente não encontrada.");
                     }
                 } else if (tipoContaExtrato == 2) {
                     ContaPoupanca contaPoupanca = banco.buscarContaPoupanca(numeroContaPoupanca);
                     if (contaPoupanca != null) {
                         contaPoupanca.exibirExtrato();
                     } else {
                         System.out.println("Conta poupança não encontrada.");
                     }
                 } else {
                     System.out.println("Opção inválida.");
                 }
                 break;

             case 3:
                 System.out.print("Digite o valor a ser sacado: ");
                 double valorSaque = scanner.nextDouble();
                 System.out.print("Digite 1 para conta corrente ou 2 para conta poupança: ");
                 int tipoContaSaque = scanner.nextInt();

                 if (tipoContaSaque == 1) {
                     ContaCorrente contaCorrente = banco.buscarContaCorrente(numeroContaCorrente);
                     if (contaCorrente != null) {
                         contaCorrente.sacar(valorSaque);
                     } else {
                         System.out.println("Conta corrente não encontrada.");
                     }
                 } else if (tipoContaSaque == 2) {
                     ContaPoupanca contaPoupanca = banco.buscarContaPoupanca(numeroContaPoupanca);
                     if (contaPoupanca != null) {
                         contaPoupanca.sacar(valorSaque);
                     } else {
                         System.out.println("Conta poupança não encontrada.");
                     }
                 } else {
                     System.out.println("Opção inválida.");
                 }
                 break;

             case 4:
                 ContaCorrente contaCorrente = banco.buscarContaCorrente(numeroContaCorrente);
                 ContaPoupanca contaPoupanca = banco.buscarContaPoupanca(numeroContaPoupanca);

                 if (contaCorrente != null && contaPoupanca != null) {
                     banco.exibirInformacoesConta(contaCorrente, contaPoupanca);
                 } else {
                     System.out.println("Conta não encontrada.");
                 }
                 break;

             case 5:
                 sair = true;
                 System.out.println("Obrigado por utilizar o Banco Digital. Até logo!");
                 break;

             default:
                 System.out.println("Opção inválida.");
                 break;
         }
     }

     scanner.close();
 }
}
