package praticas.enums;

public class Main {
	public static void main(String[] args) {
		Pedido pedido = new Pedido(10, StatusPedido.AGUARDANDO_PAGAMENTO);
		
		System.out.println("N° do pedido: " +pedido.getNumeroPedido());
		System.out.println("Status do pedido: " +pedido.getStatusAtual());
		
		pedido.setStatusAtual(StatusPedido.ENTREGUE);
		
		System.out.println("Status atualizado: " + pedido.getStatusAtual());
	}
}	
