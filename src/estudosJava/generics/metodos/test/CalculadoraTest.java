package estudosJava.generics.metodos.test;

import estudosJava.generics.metodos.Calculadora;

public class CalculadoraTest {
	public static void main(String[] args) {
		Calculadora.mostrarTipo("Eduardo");
		Calculadora.mostrarTipo(true);
		Calculadora.mostrarTipo(3.14);
		Calculadora.mostrarTipo(100);
	}
}
