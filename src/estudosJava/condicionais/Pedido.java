package estudosJava.condicionais;

public class Pedido {
	private int numeroPedido;
	private double valorTotal;
	private boolean clienteVip;
	private String status;
	
	public Pedido(int numeroPedido, double valorTotal, boolean clienteVip, String status) {
		this.numeroPedido = numeroPedido;
		this.valorTotal = valorTotal;
		this.clienteVip = clienteVip;
		this.status = status;
	}
	
	public int getNumeroPedido() {
		return numeroPedido;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public boolean getClienteVip() {
		return clienteVip;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void aplicarDesconto() {
		if (clienteVip) {
			this.valorTotal *= 0.90;
		}
	}
	
	
}
