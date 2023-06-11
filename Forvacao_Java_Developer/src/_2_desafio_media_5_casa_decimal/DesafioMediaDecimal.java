package _2_desafio_media_5_casa_decimal;

import java.util.Scanner;

public class DesafioMediaDecimal {
	public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			double A,B,media;

			System.out.println("Digite a nota A: ");
			A = scanner.nextDouble();
			System.out.println("Digite a nota B: ");
			B = scanner.nextDouble();

			media = (A*3.5 + B*7.5)/11;
		
			System.out.printf("MEDIA = %.5f", media );
        }
	}
	
}