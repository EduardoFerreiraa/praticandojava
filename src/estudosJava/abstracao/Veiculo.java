package estudosJava.abstracao;

public abstract class Veiculo {
	public String nome;
	public String modelo;
	public int ano;
	
	public Veiculo(String nome, String modelo, int ano) {
		this.nome = nome;
		this.modelo = modelo;
		this.ano = ano;
	}
	
	public abstract void ligar();
	public abstract void desligar();
	
	public void imprimir() {
		System.out.println("Nome: " +nome);
		System.out.println("Modelo: " +modelo);
		System.out.println("Ano: " +ano);
	}
	
}
