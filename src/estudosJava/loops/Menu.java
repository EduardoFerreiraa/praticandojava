package estudosJava.loops;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> produtos = new ArrayList<>();
		boolean continuar = true;

		while (continuar) {
			System.out.println("============================");
			System.out.println("Menu: ");
			System.out.println("============================");
			System.out.println("1. Cadastrar produto");
			System.out.println("2. Exibir lista de produtos");
			System.out.println("3. Sair");
			System.out.println("============================");
			System.out.print("Escolha uma opção: ");
			int escolha = scanner.nextInt();
			scanner.nextLine();

			switch (escolha) {
			case 1:
				System.out.println("============================");
				System.out.print("Digite o nome do produto: ");
				String produto = scanner.nextLine();
				produtos.add(produto);
				System.out.println("============================");
				System.out.println("Produto cadastrado!");
				System.out.println("============================");
				break;
			case 2:
				if (produtos.isEmpty()) {
					System.out.println("============================");
					System.out.println("Não há produtos cadastrados.");
					System.out.println("============================");
				} else {
					System.out.println("Lista de produtos: ");
					for (int i = 0; i < produtos.size(); i++) {
						System.out.println((i + 1) + " . " + produtos.get(i));
					}
				}
				break;
			case 3:
				continuar = false;
				System.out.println("Saindo do programa...");
				break;
			default:
				System.out.println("Opção inválida, tente novamente");
			}
		}

		scanner.close();

	}
}
