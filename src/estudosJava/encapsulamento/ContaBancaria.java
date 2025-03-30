package estudosJava.encapsulamento;

public class ContaBancaria {
	private double saldo;
	
	public ContaBancaria(double saldoInicial) {
		if (saldoInicial >= 0) {
			this.saldo = saldoInicial;
		} else {
			System.out.println("Saldo inicial inválido!");
			this.saldo = 0;
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		if (valor > 0) {
			saldo += valor;
			System.out.println("Depósito de R$" + valor + " realizado.");
		} else {
			System.out.println("Valor inválido para depósito!");
		}
	}
	
	public boolean sacar(double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			System.out.println("Saque de R$" + valor + " realizado.");
			return true;
		} else {
			System.out.println("Saldo insuficiente ou valor inválido.");
			return false;
		}
	}
}
