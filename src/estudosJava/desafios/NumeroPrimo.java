package estudosJava.desafios;

import java.util.Scanner;

public class NumeroPrimo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numero = scanner.nextInt();
		scanner.close();
		
		boolean ehPrimo = true;
		
		if (numero <= 1) {
			ehPrimo = false;
		} else {
			for (int i = 2; i < numero / 2; i++) {
				if (numero % i == 0) {
					ehPrimo = false;
					break;
				}
			}
		}
		
		if (ehPrimo) {
			System.out.println("É um número primo.");
		} else {
			System.out.println("Não é um número primo.");
		}
	}
}
