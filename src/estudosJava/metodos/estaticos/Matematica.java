package estudosJava.metodos.estaticos;

public class Matematica {
	
	public static int somar(int a, int b) {
		return a + b;
	}
	
	public static int subtrair(int a, int b) {
		return a - b;
	}
	
	public static void main(String[] args) {
		int resultado = Matematica.somar(5, 3);
		System.out.println("resultado da soma: " + resultado);
	}
}
