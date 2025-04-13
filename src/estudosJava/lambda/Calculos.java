package estudosJava.lambda;

public class Calculos {
	public static void main(String[] args) {
		OperacaoMatematica soma = (a, b) -> a + b;
		System.out.println("resultado da soma: " +soma.executar(3, 5));
	}
}
