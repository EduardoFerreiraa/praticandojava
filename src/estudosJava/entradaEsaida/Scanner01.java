package estudosJava.entradaEsaida;

import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite seu nome:");
		String nome = scanner.nextLine();
		
		System.out.print("Que ano você vai fazer esse ano: ");
		int idade = scanner.nextInt();
		
		scanner.close();
		System.out.println("Você nasceu no ano de " + (2025 - idade) + " e seu nome é " + nome);
	}
}
