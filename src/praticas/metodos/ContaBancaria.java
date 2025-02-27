package praticas.metodos;

public class ContaBancaria {
	private String titular;
	private double saldo;
	
	public ContaBancaria(String titular, double saldo) {
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if (saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}
	
	public double exibirSaldo() {
		return saldo;
	}
	
	public String exibirTitular() {
		return titular;
	}
}
