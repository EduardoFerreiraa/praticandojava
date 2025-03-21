package estudosJava.metodos.instancias;

public class Pessoa {
	String nome;
	
	public void saudacao() {
		System.out.println("Olá, meu nome é: " +nome);
	}
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		pessoa1.nome = "João";
		pessoa2.nome = "Eduardo";
		
		pessoa1.saudacao();
		pessoa2.saudacao();
	}
}
