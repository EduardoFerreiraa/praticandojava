package praticas.logica;

import java.util.Scanner;

public class ImparOuPar {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int numero = scanner.nextInt();
		
		scanner.close();
		
		if(numero % 2 == 0) {
			System.out.println("É par!");
		} else {
			System.out.println("É impar!");
		}
	}
}
