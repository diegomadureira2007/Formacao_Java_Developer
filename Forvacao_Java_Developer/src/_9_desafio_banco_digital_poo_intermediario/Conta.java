package _9_desafio_banco_digital_poo_intermediario;
import java.util.ArrayList;
import java.util.List;

//Classe Conta representa uma conta genérica no banco
abstract class Conta {
 private Cliente titular;
 private int agencia;
 private int numero;
 private double saldo;
 private List<String> extrato;

 public Conta(Cliente titular, int agencia, int numero, double saldo) {
     this.titular = titular;
     this.agencia = agencia;
     this.numero = numero;
     this.saldo = saldo;
     this.extrato = new ArrayList<>();
 }

 public void depositar(double valor) {
     saldo += valor;
     extrato.add("Depósito: +" + valor);
 }

 public void sacar(double valor) {
     if (valor > 0 && valor <= saldo) {
         saldo -= valor;
         extrato.add("Saque: -" + valor);
     } else {
         System.out.println("Saldo insuficiente.");
     }
 }

 public void exibirExtrato() {
     System.out.println("Extrato da conta " + numero + " - " + titular.getNome());
     for (String operacao : extrato) {
         System.out.println(operacao);
     }
     System.out.println("Saldo atual: " + saldo);
 }

 public Cliente getTitular() {
     return titular;
 }

 public int getAgencia() {
     return agencia;
 }

 public int getNumero() {
     return numero;
 }

 public double getSaldo() {
     return saldo;
 }
}
