package praticas.logica;

import java.util.Scanner;

public class VotacaoSimples {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = scanner.nextLine();
		
		System.out.print("Digite a sua idade: ");
		int idade = scanner.nextInt();
		
		scanner.close();
		
		if(idade >= 16) {
			System.out.println("Você tem idade para votar, " +nome);
		} else {
			System.out.println("Você ainda não tem idade para votar, " +nome);
		}
		
	}
}
