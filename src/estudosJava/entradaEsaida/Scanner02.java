package estudosJava.entradaEsaida;

import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite até o número que você deseja contar: ");
		int contador = scanner.nextInt();
		
		for (int i = 1; i <= contador; i++) {
			System.out.println(i);
		}
		
		scanner.close();
	}
}	
