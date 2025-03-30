package estudosJava.encapsulamento;

public class Teste {
	public static void main(String[] args) {
		ContaBancaria minhaConta = new ContaBancaria(500);
		System.out.println("Saldo inicial: " + minhaConta.getSaldo());
		
		minhaConta.depositar(200);
		minhaConta.sacar(100);
		minhaConta.sacar(1000);
		
		System.out.println("Saldo final: R$" + minhaConta.getSaldo());
	}
}
