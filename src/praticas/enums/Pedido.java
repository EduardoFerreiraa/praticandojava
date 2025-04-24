package praticas.enums;

public class Pedido {
	private int numeroPedido;
	private StatusPedido statusAtual;
	
	public Pedido(int numeroPedido, StatusPedido statusAtual) {
		this.numeroPedido = numeroPedido;
		this.statusAtual = statusAtual;
	}
	
	 public int getNumeroPedido() {
	     return numeroPedido;
	 }

	 public StatusPedido getStatusAtual() {
	     return statusAtual;
	 }

	 public void setStatusAtual(StatusPedido novoStatus) {
	     this.statusAtual = novoStatus;
	 }
}
