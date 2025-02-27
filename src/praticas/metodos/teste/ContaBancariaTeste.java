package praticas.metodos.teste;

import praticas.metodos.ContaBancaria;

public class ContaBancariaTeste {
	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria("Eduardo", 1000);
		
		System.out.println("Titular: " + conta.exibirTitular());
		System.out.println("Saldo inicial: " + conta.exibirSaldo());
		
		conta.depositar(200);
		System.out.println("Saldo após depósito: " + conta.exibirSaldo());
		
		if (conta.sacar(500)) {
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente.");
		}
		
		System.out.println("Saldo final: " + conta.exibirSaldo());
	}
}
