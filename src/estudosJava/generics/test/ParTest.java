package estudosJava.generics.test;

import estudosJava.generics.Par;

public class ParTest {
	public static void main(String[] args) {
		Par<String, Integer> nomeIdade = new Par<>("Eduardo", 18);
		nomeIdade.exibirPar();
		
		Par<Double, Double> coordenadas = new Par<>(3.5, 7.2);
		coordenadas.exibirPar();
	}
}
