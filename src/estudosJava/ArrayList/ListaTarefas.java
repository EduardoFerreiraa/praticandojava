package estudosJava.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class ListaTarefas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<String> tarefas = new ArrayList<>();
		boolean executando = true;
		
		while (executando) {
			System.out.println("\nMENU DE TAREFAS");
			System.out.println("===================");
			System.out.println("1. Adicionar tarefa");
			System.out.println("2. Listar tarefas");
			System.out.println("3. Remover tarefa");
			System.out.println("4. Sair");
			System.out.print("Escolha uma opção: ");
			int opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			case 1:
				System.out.println("Digite a tarefa:");
				String tarefa = scanner.nextLine();
				tarefas.add(tarefa);
				System.out.println("==================");
				System.out.println("Tarefa adicionada!");
				System.out.println("==================");
				break;
			case 2:
				System.out.println("================");
				System.out.println("\nTAREFAS: ");
				System.out.println("================");
				if (tarefas.isEmpty()) {
					System.out.println("==========================");
					System.out.println("Nenhuma tarefa cadastrada.");
					System.out.println("==========================");
				} else {
					for (int i = 0; i < tarefas.size(); i++) {
						System.out.println((i + 1) + ". " + tarefas.get(i));
					}
				}
				break;
			case 3:
				System.out.println("Digite o número da tarefa para remover: ");
				int indice = scanner.nextInt();
				if (indice > 0 && indice <= tarefas.size()) {
					tarefas.remove(indice - 1);
					System.out.println("================");
					System.out.println("Tarefa removida!");
					System.out.println("================");
				} else {
					System.out.println("===============");
					System.out.println("Número inválido");
					System.out.println("===============");
				}
				break;
			case 4:
				executando = false;
				System.out.println("=========");
				System.out.println("Saindo...");
				System.out.println("=========");
				break;
			default: 
				System.out.println("Opção inválida. Tente novamente.");
			}
		}
		
		scanner.close();
		
	}
}
