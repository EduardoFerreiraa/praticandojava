package estudosJava.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaNomes {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> nomes = new ArrayList<>();
		boolean executando = true;
		
		while (executando) {
			System.out.println("1. Adicionar nome na lista");
			System.out.println("2. Exibir nomes");
			System.out.println("2. Sair");
			System.out.print("Digite a opção: ");
			int options = scanner.nextInt();
			scanner.nextLine();
			
			switch (options) {
				case 1:
					System.out.print("Digite um nome: ");
					String nome = scanner.nextLine();
					nomes.add(nome);
					System.out.println("Nome adicionado!");
					break;
				case 2:
					if (nomes.isEmpty()) {
						System.out.println("Nenhum nome na lista.");
					} else {
						System.out.println("Nomes na lista: ");
						for (int i = 0; i < nomes.size(); i++) {
							System.out.println((i + 1) + ". " +nomes.get(i));
						}
					}
					break;
				case 3:
					executando = false;
					System.out.println("Saindo...");
					break;
				default:
					System.out.println("Não temos essa opção.");
					break;
			}
			
			
		}
		
		scanner.close();
	}
}
