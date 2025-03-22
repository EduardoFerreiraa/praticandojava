package estudosJava.metodos.instancias;

public class Calculadora {
	
	public void somar(int a, int b) {
		int resultado = a + b;
		System.out.println("A soma de " + a + " e " + b + " é: " + resultado);
	}
	
	public static void main(String[] args) {
		Calculadora calc = new Calculadora();
		
		calc.somar(5, 10);
	}
}
