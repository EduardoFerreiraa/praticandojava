package estudosJava.condicionais;

import java.util.Scanner;

public class GerenciadorPedidos {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Número do pedido: ");
		int numero = scanner.nextInt();
		
		System.out.print("Valor do pedido: ");
		double valor = scanner.nextDouble();
		
		System.out.print("O cliente é VIP? (true/false): ");
		boolean vip = scanner.nextBoolean();
		
		scanner.nextLine();
		
		System.out.println("Status do Pedido (PENDENTE/ ENVIADO/ ENTREGUE/ CANCELADO: ");
		String status = scanner.nextLine().toUpperCase();
		
		Pedido pedido = new Pedido(numero, valor, vip, status);
		System.out.println("================================");
		
		switch (pedido.getStatus()) {
			case "PENDENTE":
				System.out.println("O pedido ainda está em processamento.");
				break;
			case "ENVIADO":
				System.out.println("O pedido voi enviado.");
				break;
			case "ENTREGUE":
				System.out.println("O pedido já foi entregue.");
				break;
			case "CANCELADO":
				System.out.println("O pedido foi cancelado.");
				break;
			default:
				System.out.println("Status inválido.");
				break;
		}
		
		System.out.println("=============== RESUMO DO PEDIDO ===============");
		System.out.println("Número do pedido: " +pedido.getNumeroPedido());
		System.out.println("Valor final R$: " +pedido.getValorTotal());
		System.out.println("Status: " +pedido.getStatus());
		
		scanner.close();
	}
}
