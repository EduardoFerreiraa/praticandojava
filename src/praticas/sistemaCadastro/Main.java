package praticas.sistemaCadastro;

import java.util.Scanner;

import praticas.sistemaCadastro.service.UsuarioService;

public class Main {
	public static void main(String[] args) {
		UsuarioService usuarioService = new UsuarioService();
		Scanner scanner = new Scanner(System.in);
		
		boolean executando = true;
		
		while (executando) {
			System.out.println("\n==MENU==");
			System.out.println("1 - Cadastrar usuários");
			System.out.println("2 - Listar usuários");
			System.out.println("0 - Sair");
			System.out.println("Escolha uma opção");
			int opcao = scanner.nextInt();
			
			scanner.nextLine();
			
			switch(opcao) {
				case 1:
					System.out.println("Digite seu nome: ");
					String nome = scanner.nextLine();
					
					System.out.println("Digite seu email: ");
					String email = scanner.nextLine();
					
					System.out.println("Digite sua idade: ");
					int idade = scanner.nextInt();
					scanner.nextLine();
					
					usuarioService.cadastrarUsuario(nome, email, idade);
					break;
					
				case 2:
					usuarioService.listarUsuarios();
					System.out.println("Encerrando o programa...");
					break;
					
				case 3:
					executando = false;
					System.out.println("Encerrando o programa!");
					break;
					
				default:
					System.out.println("Opção inválida");
			}
		}
		
		scanner.close();
	}
}
