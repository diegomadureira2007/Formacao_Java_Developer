package _3_desafio_contabanco_basico;

import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {
			try (Scanner scanner = new Scanner(System.in)){
				
				System.out.println("Por favor, digite o seu Nome: ");
				String nomeCliente = scanner.next();
				
				System.out.println("Por favor, digite o número da Agência: ");
				String agencia = scanner.next();
				
				System.out.println("Por favor, digite o número da Conta: ");
				int numero = scanner.nextInt();
				
				System.out.println("Por favor, o valor de Depósito: ");
				double saldo = scanner.nextDouble();
				
				System.out.printf("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, sua agência é: "
						+agencia+ ", conta: " +numero+ " e seu saldo: " +saldo+ " já está disponível para saque.");
				}
		}
}
		
	