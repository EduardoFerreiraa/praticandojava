package estudosJava.lambda;

public class ExemploLambda {
	public static void main(String[] args) {
		Saudacao saudacao = nome -> System.out.println("Olá, " + nome + " Seja bem-vindo.");
		
		saudacao.dizerOLa("Maria");
	}
}
