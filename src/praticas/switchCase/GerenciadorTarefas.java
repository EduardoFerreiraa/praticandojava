package praticas.switchCase;

import java.util.Scanner;

public class GerenciadorTarefas {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===============================================");
		System.out.println("1: Você escolheu: Enviar relatório para o chefe");
		System.out.println("2: Você escolheu: Revisar código do sistema");
		System.out.println("3: Você escolheu: Corrigir bugs");
		System.out.println("4: Você escolheu: Estudar novas tecnologias");
		System.out.println("5: Você escolheu: Atendeu reunião com a equipe");
		System.out.println("===============================================");
		
		System.out.print("Digite um número de 1 a 5 para escolher sua tarefa: ");
		
		int opcao = scanner.nextInt();
		
		Tarefa tarefa = new Tarefa(opcao);
		
		switch (tarefa.getOpcao()) {
			case 1:
				System.out.println("Você escolheu: Enviar relatório para o chefe");
				break;
			case 2:
				System.out.println("Você escolheu: Revisar código do sistema");
				break;
			case 3:
				System.out.println("Você escolheu: Corrigir bugs");
				break;
			case 4:
				System.out.println("Você escolheu: Estudar novas tecnologias");
				break;
			case 5:
				System.out.println("Você escolheu: Atendeu reunião com a equipe");
				break;
			default:
				System.out.println("Tarefa inválida");
		}
		
		scanner.close();
	}
}
