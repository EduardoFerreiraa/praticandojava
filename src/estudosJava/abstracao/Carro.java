package estudosJava.abstracao;

public class Carro extends Veiculo {
	
	public Carro(String nome, String modelo, int ano) {
		super(nome, modelo, ano);
	}
	
	public void ligar() {
		System.out.println("Ligando carro!");
	}
	
	public void desligar() {
		System.out.println("Desligando carro!");
	}
}
