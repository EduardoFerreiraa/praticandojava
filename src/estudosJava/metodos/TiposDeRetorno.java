package estudosJava.metodos;

public class TiposDeRetorno {
	
	public void exibirMensagem() {
		System.out.println("Olá!");
	}
	
	public int somar(int a, int b, int c) {
		return a + b + c;
	}
	
	public double calcularMedia(double nota1, double nota2) {
		return (nota1 + nota2) / 2;
	}
	
	public boolean ePar(int numero) {
		return numero % 2 == 0;
	}
	
	public String saudacao(String nome) {
		return "Olá, " + nome + "!";
	}
	
	
	
	
}
