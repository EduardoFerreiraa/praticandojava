package estudosJava.abstracao;

public class Moto extends Veiculo {
	
	public Moto(String nome, String modelo, int ano) {
		super(nome, modelo, ano);
	}
	
	public void ligar() {
		System.out.println("Ligando moto!");
	}
	
	public void desligar() {
		System.out.println("Desligando moto!");
	}
}
