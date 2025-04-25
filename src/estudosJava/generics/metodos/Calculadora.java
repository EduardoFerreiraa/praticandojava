package estudosJava.generics.metodos;

public class Calculadora {
	
	public static <T> void mostrarTipo(T valor) {
		System.out.println("Valor: " + valor);
		System.out.println("Tipo: " + valor.getClass().getName());
	}
}
